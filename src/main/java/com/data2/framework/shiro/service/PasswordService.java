package com.data2.framework.shiro.service;

import com.data2.common.exception.user.UserPasswordNotMatchException;
import com.data2.common.exception.user.UserPasswordRetryLimitExceedException;
import com.data2.project.system.user.entity.User;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 登陆密码方法
 */
@Component
public class PasswordService {

    @Autowired
    private CacheManager cacheManager;

    private Cache<String, AtomicInteger> loginRecordCache;

    @Value(value = "${user.password.maxRetryCount}")
    private String maxRetryCount;

    public void init(){
        loginRecordCache = cacheManager.getCache("loginRecordCache");
    }

    public void validate(User user, String password){
        String loginName = user.getLoginName();
        AtomicInteger retryCount = loginRecordCache.get(loginName);
        if (retryCount == null){
            retryCount = new AtomicInteger(0);
            loginRecordCache.put(loginName,retryCount);
        }
        if (retryCount.incrementAndGet() > Integer.valueOf(maxRetryCount).intValue()){
            throw new UserPasswordRetryLimitExceedException(Integer.valueOf(maxRetryCount).intValue());
        }
        if (!matches(user,password)){
            loginRecordCache.put(loginName,retryCount);
            throw new UserPasswordNotMatchException();
        }
        else {
            clearLoginRecordCache(loginName);
        }
    }


    public boolean matches(User user,String newPassword){
        return user.getPassword().equals(encryptPassword(user.getLoginName(),newPassword,user.getSalt()));
    }

    public void clearLoginRecordCache(String username){
        loginRecordCache.remove(username);
    }

    public String encryptPassword(String username,String password,String salt){
        return new Md5Hash(username + password + salt).toHex().toString();
    }
}
