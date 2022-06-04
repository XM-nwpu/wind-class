package com.windclass.demo.controller;

import com.windclass.demo.dao.UserDao;
import com.windclass.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/test")
    public User test() {
        //List<User> all = userRepository.findAll();
        User user = userDao.getByNameAndPassword("admin", "123456");
        return user;
    }
}
