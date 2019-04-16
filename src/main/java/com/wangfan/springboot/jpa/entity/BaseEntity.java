package com.wangfan.springboot.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
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
public class BaseEntity
{
    @JsonIgnore
    private int state;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;

}
