package com.data2.project.system.role.service;

import com.data2.common.utils.StringUtils;
import com.data2.project.system.role.entity.Role;
import com.data2.project.system.role.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        List<Role> userRoles = roleMapper.selectRolesByUserId(userId);
        List<Role> roles = roleMapper.selectRolesAll();
        for (Role role : roles){
            for (Role userRole : userRoles){
                if (role.getRoleId() == userRole.getRoleId()){
                    role.setFlag(true);
                    break;
                }
            }
        }
        return roles;
    }

    /**
     * 根据用户ID查询角色权限
     * @param userId
     * @return
     */
    @Override
    public Set<String> selectRoleKey(Integer userId) {
        List<Role> perms = roleMapper.selectRolesByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (Role perm : perms){
            if (StringUtils.isNotNull(perms)){
                permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
            }
        }

        return permsSet;
    }
}
