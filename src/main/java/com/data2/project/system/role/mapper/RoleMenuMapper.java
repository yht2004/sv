package com.data2.project.system.role.mapper;

import com.data2.project.system.role.entity.RoleMenu;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

    int insert(RoleMenu record);

    List<RoleMenu> selectAll();
}