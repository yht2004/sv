package com.data2.project.system.user.service;

import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务处理
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return null;
    }

    @Override
    public User selectUserByUserId(Integer userId) {
        return null;
    }

    /**
     * 根据登录名查询用户
     * @return
     */
    @Override
    public User selectUserByLoginName(String loginName) {
        return userMapper.selectUserByLoginName(loginName);
    }

    @Override
    public int deleteUserByUserId(Integer userId) {
        return 0;
    }

    @Override
    public int batchDeleteUser(Integer[] ids) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int checkLoginNameUnique(String loginName) {
        return 0;
    }

    @Override
    public User checkPhonenumberUnique(String phonenumber) {
        return null;
    }

    @Override
    public User checkEmailUnique(String email) {
        return null;
    }
}
