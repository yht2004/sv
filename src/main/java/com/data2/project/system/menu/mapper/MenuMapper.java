package com.data2.project.system.menu.mapper;

import com.data2.project.system.menu.entity.Menu;
import java.util.List;

/**
 * 数据层  menu
 */
public interface MenuMapper {

    /**
     * 根据用户ID查询菜单
     * @param userId
     * @return
     */
    public List<Menu> selectMenuByUserId(Integer userId);

    /**
     * 根据用户ID查询权限
     * @param userId
     * @return
     */
    public List<String> selectPermsByUserId(Integer userId);


}