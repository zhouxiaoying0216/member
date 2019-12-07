package com.test;

import com.controller.impl.RegisterControllerImpl;
import com.entity.MemberInfo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * @Author zxy
 * @create 2019/12/7 14:53
 */
@SpringBootTest
public class RegisterTest extends AbstractTestNGSpringContextTests {

    @Resource
    RegisterControllerImpl registerController;

    @Resource
    MemberInfo memberInfo;

    @Test
    public void registerTest(){

        memberInfo.setUserName("lili");
        memberInfo.setPassword("123456");
        memberInfo.setAge(11);
        memberInfo.setSex(0);
        memberInfo.setMobilePhone("135123210980");
        String result=registerController.registerInfoController(memberInfo);


    }
}
