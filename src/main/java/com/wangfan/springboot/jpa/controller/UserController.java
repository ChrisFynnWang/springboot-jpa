package com.wangfan.springboot.jpa.controller;

import com.wangfan.springboot.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2019/4/16
 * @Other:
 */
@RestController
@RequestMapping("user")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("get/{userId}")
    public Object getUser(@PathVariable("userId") int userId)
    {
        return userService.getUser(userId);
    }
}
