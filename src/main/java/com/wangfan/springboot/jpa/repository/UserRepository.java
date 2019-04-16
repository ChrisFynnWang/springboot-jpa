package com.wangfan.springboot.jpa.repository;

import com.wangfan.springboot.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2019/4/16
 * @Other:
 */
public interface UserRepository extends JpaRepository<User,Integer>
{
}
