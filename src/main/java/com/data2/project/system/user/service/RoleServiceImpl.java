package com.data2.project.system.user.service;

import com.data2.project.system.role.entity.Role;
import com.data2.project.system.role.mapper.RoleMapper;
import com.data2.project.system.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务处理
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 根据用户ID查询角色
     * @param userId
     * @return
     */
    @Override
    public List<Role> selectRoleByUserId(Integer userId) {
        return roleMapper.selectRolesByUserId(userId);
    }
}
