package com.data2.project.system.role.service;

import com.data2.project.system.role.entity.Role;

import java.util.List;
import java.util.Set;

/**
 * 业务处理
 */
public interface RoleService {

    /**
     * 根据用户ID查询角色
     * @param userId
     * @return 角色列表
     */
    public List<Role> selectRoleByUserId(Integer userId);

    /**
     * 根据用户ID查询角色权限
     * @param userId
     * @return 权限集合
     */
    public Set<String> selectRoleKey(Integer userId);
}
