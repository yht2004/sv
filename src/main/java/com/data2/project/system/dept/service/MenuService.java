package com.data2.project.system.dept.service;

import com.data2.project.system.menu.entity.Menu;

import java.util.List;

/**
 * 业务处理
 */
public interface MenuService {
    /**
     * 根据用户ID查询菜单
     * @param userId
     * @return
     */
    public List<Menu> selectMenuByUserId(Integer userId);
}
