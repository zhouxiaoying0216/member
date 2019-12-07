package com.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author zxy
 * @create 2019/12/6 16:11
 */
@Component
@Data
public class MemberIntegralInfo {

    private Integer id;

    private Integer memberId;

    private Integer integral;

    private Date createTime ;

    private Date updateTime ;
}
