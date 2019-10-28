package com.data2.project.system.post.mapper;

import com.data2.project.system.post.entity.Post;
import java.util.List;

public interface PostMapper {
    int deleteByPrimaryKey(Integer postId);

    int insert(Post record);

    Post selectByPrimaryKey(Integer postId);

    List<Post> selectAll();

    int updateByPrimaryKey(Post record);
}