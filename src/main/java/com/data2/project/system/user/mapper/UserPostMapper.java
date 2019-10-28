package com.data2.project.system.user.mapper;

import com.data2.project.system.user.entity.UserPost;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPostMapper {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("postId") Integer postId);

    int insert(UserPost record);

    List<UserPost> selectAll();
}