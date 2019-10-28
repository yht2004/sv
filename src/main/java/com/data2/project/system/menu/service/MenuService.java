package com.data2.project.system.menu.service;

import com.data2.project.system.menu.entity.Menu;

import java.util.List;
import java.util.Set;

/**
 * 业务处理 menu
 */
public interface MenuService {

    /**
     * 根据用户ID查询菜单
     * @param userId
     * @return
     */
    public List<Menu> selectMenuByUserId(Integer userId);

    /**
     * 根据ID查询权限
     * @param userId
     * @return
     */
    public Set<String> selectPermsByUserId(Integer userId);
}
