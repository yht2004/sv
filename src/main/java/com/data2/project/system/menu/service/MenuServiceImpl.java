package com.data2.project.system.menu.service;

import com.data2.project.system.menu.entity.Menu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * 业务处理类
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Override
    public List<Menu> selectMenuByUserId(Integer userId) {
        return null;
    }

    @Override
    public Set<String> selectPermsByUserId(Integer userId) {
        return null;
    }
}
