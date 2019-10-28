package com.data2.project.system.user.controller;

import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.service.MenuService;
import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private MenuService menuService;

    @PostMapping("/login")
    public String checkLogin(String login, String pwd, Model model){
        if (login != null && pwd != null){
            User user = userService.selectUserByLoginName(login);
            Integer userId = user.getUserId();
            System.out.println(userId);
            //根据用户ID去除菜单
            List<Menu> menus = menuService.selectMenuByUserId(userId);
            model.addAttribute("menus",menus);
            return "main/index";
        }
        else {
            return "main/login";
        }
    }

}
