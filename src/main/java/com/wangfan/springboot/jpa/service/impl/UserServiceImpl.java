package com.wangfan.springboot.jpa.service.impl;

import com.wangfan.springboot.jpa.entity.User;
import com.wangfan.springboot.jpa.repository.UserRepository;
import com.wangfan.springboot.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2019/4/16
 * @Other:
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;

    public User getUser(int userId)
    {
        return userRepository.findOne(userId);
    }
}
