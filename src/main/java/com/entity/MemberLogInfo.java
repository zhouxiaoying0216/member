package com.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author zxy
 * @create 2019/12/6 16:13
 */
@Component
@Data
public class MemberLogInfo {

    private Integer id;

    private Integer memberId;

    private Integer actions;

    private Date actionTime ;

    private String comment ;
}
