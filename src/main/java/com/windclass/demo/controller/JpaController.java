package com.windclass.demo.controller;

import com.windclass.demo.dao.UserDao;
import com.windclass.demo.pojo.User;
import com.windclass.demo.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "登录验证接口", description = "用用户名密码登录")
public class JpaController {
    @Autowired
    UserDao userDao;

    @CrossOrigin
    @PostMapping(value = "api/")
    @ResponseBody
    @ApiOperation(value = "账号登录", httpMethod = "POST", response = User.class, notes = "account login")
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getName();
        String password = requestUser.getPassword();
        System.out.println("---------------trying login----------------");
        System.out.println("Request: " + username + " " + password);
        User user = userDao.getByNameAndPassword(username, password);
        if (null == user) {
            System.out.println("login failed..");
            return new Result(400);
        } else {
            System.out.println("login succeed..");
            return new Result(200);
        }
    }
}
