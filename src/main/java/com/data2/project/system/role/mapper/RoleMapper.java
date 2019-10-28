package com.data2.project.system.role.mapper;

import com.data2.project.system.role.entity.Role;
import java.util.List;

public interface RoleMapper {

    /**
     * 根据用户ID查询角色
     * @param userId
     * @return
     */
    public List<Role> selectRolesByUserId(Integer userId);

    /**
     * 查询所有角色
     * @return
     */
    public List<Role> selectRolesAll();

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    Role selectByPrimaryKey(Long id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}