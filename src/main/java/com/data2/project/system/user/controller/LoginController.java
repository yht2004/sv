package com.data2.project.system.user.controller;

import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户登录
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    /**
     *cloud index
     * @return
     */
    @GetMapping("/cloudlogin")
    public String cloudLogin(){
        return "main/index";
    }

    @PostMapping("/login")
    @ResponseBody
    public String ajaxLogin(String loginname,String password){
        if (loginname != null && password != null){
            User user = userService.selectUserByLoginName(loginname);
            if (user != null && user.getPassword() == password){
                return "redirect:/main";
            }
        }
        return "login";
    }

    @GetMapping("/main")
    public String main(){
        return "mian";
    }


}
