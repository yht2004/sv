package com.data2.common.utils.security;

import com.data2.project.system.user.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;

/**
 * shiro工具类
 */
public class ShiroUtils {

    public static Subject getSubject(){
        return SecurityUtils.getSubject();
    }

    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }

    public static void logout(){
        getSubject().logout();
    }

    public static User getUser(){
        return (User) getSubject().getPrincipal();
    }

    public static void setUser(User user){
        Subject subject = getSubject();
        PrincipalCollection principalCollection = subject.getPrincipals();
        String realName = principalCollection.getRealmNames().iterator().next();
        PrincipalCollection newPrincipalCollection = new SimplePrincipalCollection(user,realName);

        subject.runAs(newPrincipalCollection);
    }

    public static Integer getUserId(){
        return getUser().getUserId().intValue();
    }

    public static String getLoginName(){
        return getUser().getLoginName();
    }

    public static String getIp(){
        return getSubject().getSession().getHost();
    }

    public static String getSessionId(){
        return String.valueOf(getSubject().getSession().getId());
    }

}
