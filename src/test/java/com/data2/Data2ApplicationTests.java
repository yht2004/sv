package com.data2;




import com.data2.common.utils.StringUtils;
import com.data2.common.utils.TreeUtils;
import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.mapper.MenuMapper;
import com.data2.project.system.menu.service.MenuService;
import com.data2.project.system.role.entity.Role;
import com.data2.project.system.role.mapper.RoleMapper;
import com.data2.project.system.role.service.RoleService;
import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.mapper.UserMapper;
import com.data2.project.system.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Data2ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @Autowired
    MenuMapper menuMapper;

    @Autowired
    MenuService menuService;

    @Autowired
    RoleService roleService;

    @Autowired
    RoleMapper roleMapper;

    @Test
    public void selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        System.out.println(users);
        for (User user : users){
            System.out.println(user.getUserName());
        }
    }

    @Test
    public void selectUserByUserId() {
        User user = userMapper.selectUserByUserId(52);
        if (user ==null){
            System.out.println("无此用户");
        }else {
            System.out.println(user.getUserName());
        }

    }
    @Test
    public void selectUserByLoginName() {
        User user = userService.selectUserByLoginName("ry");
        System.out.println(user.getUserName()+"-"+user.getLoginName());
    }

    @Test
    public void selectMenuByUserId() {
        List<Menu> list = menuService.selectMenuByUserId(1);
        for (Menu n : list){
            System.out.println(n.getMenuName());
        }
    }

    @Test
    public void selectMenuByUserId2() {
        List<Menu> menus = menuService.selectMenuByUserId(101);
        for (Menu n : menus){
            System.out.println(n.getMenuName());
        }
    }


    @Test
    public void selectRoleByUserId() {
        List<Role> roles = roleService.selectRoleByUserId(101);
        for (Role role : roles){
            System.out.println(role.getRoleName());
        }
    }

    @Test
    public void selectRoleByUserId2() {
        List<Role> roles = roleMapper.selectRolesByUserId(101);
        for (Role role : roles){
            System.out.println(role.getRoleName());
        }
    }


    @Test
    public void selectRoleKey() {
        Set<String> roleKey = roleService.selectRoleKey(101);
        Iterator<String> it = roleKey.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static String getType(Object o){
        return o.getClass().toString();
    }


    @Test
    public void selectPermsByUserId() {
        List<String> perms = menuMapper.selectPermsByUserId(1);
        for (String perm : perms){
            System.out.println(perm);
        }

    }

}
