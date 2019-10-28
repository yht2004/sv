package com.data2.project.system.menu.service;

import com.data2.common.utils.StringUtils;
import com.data2.common.utils.TreeUtils;
import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 业务处理
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectMenuByUserId(Integer userId) {

        List<Menu> menus = menuMapper.selectMenuByUserId(userId);
        return TreeUtils.getChildListMenu(menus,0);
    }

    /**
     * 根据用户ID查询权限
     * @param userId
     * @return
     */
    @Override
    public Set<String> selectPermsByUserId(Integer userId) {
        List<String> perms = menuMapper.selectPermsByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (String perm : perms){
            if (StringUtils.isNotEmpty(perm)){
                permsSet.addAll(Arrays.asList(perm.trim().split(",")));
            }
        }

        return permsSet;
    }
}
