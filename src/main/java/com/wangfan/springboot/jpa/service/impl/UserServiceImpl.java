package com.wangfan.springboot.jpa.service.impl;

import com.alibaba.fastjson.JSON;
import com.wangfan.springboot.jpa.entity.User;
import com.wangfan.springboot.jpa.repository.UserRepository;
import com.wangfan.springboot.jpa.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


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
    private static final String USER_KEY = "USER_";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public User getUser(int userId)
    {
        String redisStr = redisTemplate.opsForValue().get(USER_KEY + userId);
        if (!StringUtils.isEmpty(redisStr)) {

            return JSON.parseObject(redisStr, User.class);
        }
        User one = userRepository.findById(userId).get();
        if (null != one) {
            redisTemplate.opsForValue().set(USER_KEY + one.getUserId(),JSON.toJSONString(one));
        }
        return one;
    }
}
