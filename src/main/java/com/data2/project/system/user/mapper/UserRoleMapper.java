package com.data2.project.system.user.mapper;

import com.data2.project.system.user.entity.UserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("roleId") Long roleId);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(@Param("id") Long id, @Param("roleId") Long roleId);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}