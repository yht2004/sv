package com.data2;



import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.mapper.UserMapper;
import com.data2.project.system.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Data2ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

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

}
