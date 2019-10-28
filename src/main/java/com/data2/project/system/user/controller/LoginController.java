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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户登录
 */
@Controller
public class LoginController {

    /**
     *cloud index
     * @return
     */
    @GetMapping("/login")
    public String cloudLogin(){
        return "main/login";
    }




}
