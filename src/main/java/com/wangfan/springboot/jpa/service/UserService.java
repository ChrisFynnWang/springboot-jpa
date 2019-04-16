package com.wangfan.springboot.jpa.service;

import com.wangfan.springboot.jpa.entity.User;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2019/4/16
 * @Other:
 */
public interface UserService
{
    User getUser(int userId);
}
