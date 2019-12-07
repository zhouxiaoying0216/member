package com.controller.impl;

import com.controller.RegisterController;
import com.entity.MemberInfo;
import com.service.impl.RegisterServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author zxy
 * @create 2019/12/7 14:45
 */
@RestController
public class RegisterControllerImpl implements RegisterController {

    @Resource
    RegisterServiceImpl registerService;

    @Override
    public String registerInfoController(MemberInfo memberInfo){

        String result=registerService.insertMemberInfoServise(memberInfo);
        return "会员信息增加成功"+result;
    }
}
