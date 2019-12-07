package com.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author zxy
 * @create 2019/12/6 16:00
 */
@Component
@Data
public class MemberInfo {

    private Integer memberId;

    private String userName;

    private String password;

    private Integer age;

    private Integer sex;

    private String mobilePhone;

    private Integer memberType;

    private Integer status;

    private Date createTime ;

    private Date updateTime ;

    private String mid;

    private String businessId;
}
