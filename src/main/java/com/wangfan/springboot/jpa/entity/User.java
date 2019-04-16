package com.wangfan.springboot.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;


/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2019/4/16
 * @Other:
 */
@Data
@Entity
public class User extends BaseEntity
{
    @Id
    @GeneratedValue
    private int userId;

    private String userName;
}
