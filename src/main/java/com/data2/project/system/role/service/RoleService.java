package com.data2.project.system.role.service;

import com.data2.project.system.role.entity.Role;

import java.util.List;

/**
 * 业务处理
 */
public interface RoleService {

    /**
     * 根据用户ID查询角色
     * @param userId
     * @return
     */
    public List<Role> selectRoleByUserId(Integer userId);
}
