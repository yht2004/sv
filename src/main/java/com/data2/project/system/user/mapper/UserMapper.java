package com.data2.project.system.user.mapper;

import com.data2.project.system.user.entity.User;
import java.util.List;

public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> selectAllUser();

    /**
     * 根据用户ID查询用户
     * @return
     */
    public User selectUserByUserId(Integer userId);

    /**
     * 根据登陆名查询用户
     * @return
     */
    public User selectUserByLoginName(String loginName);

    /**
     * 根据用户ID删除用户
     * @param userId
     * @return
     */
    public int deleteUserByUserId(Integer userId);

    /**
     * 批量删除用户
     * @param ids
     * @return
     */
    public int batchDeleteUser(Integer[] ids);

    /**
     * 更新用户
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 增加用户
     * @param user
     * @return
     */
    public int insertUser(User user);

    /**
     * 校验登录名唯一性
     * @param loginName
     * @return
     */
    public int checkLoginNameUnique(String loginName);

    /**
     * 检验手机号唯一性
     * @param phonenumber
     * @return
     */
    public User checkPhonenumberUnique(String phonenumber);

    /**
     * 校验邮箱唯一性
     * @param email
     * @return
     */
    public User checkEmailUnique(String email);
}