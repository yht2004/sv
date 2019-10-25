package com.data2.project.system.dept.service;

import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务处理层
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 根据用户id获取菜单
     * @param userId
     * @return
     */
    @Override
    public List<Menu> selectMenuByUserId(Integer userId) {
        return menuMapper.selectMenuByUserId(userId);
    }
}
