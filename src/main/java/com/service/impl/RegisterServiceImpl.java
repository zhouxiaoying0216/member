package com.service.impl;

import com.dao.RegisterDao;
import com.entity.MemberInfo;
import com.entity.MemberIntegralInfo;
import com.entity.MemberLogInfo;
import com.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author zxy
 * @create 2019/12/6 17:06
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    RegisterDao registerDao;

    @Resource
    MemberIntegralInfo memberIntegralInfo;

    @Resource
    MemberLogInfo memberLogInfo;

    @Override
    public String insertMemberInfoServise(MemberInfo memberInfo){

     //判断手机号在mermber_info表是否存在
        MemberInfo result=registerDao.selectRegisterInfoDao(memberInfo);

        System.out.println(result);

        if(result!=null){

            return "该用户已注册过，请直接登录";

        }else {

            memberInfo.setMemberType(0);
            memberInfo.setStatus(0);
            int addresult=registerDao.insertMemberInfoDao(memberInfo);

            int memId=memberInfo.getMemberId();
            memberIntegralInfo.setMemberId(memId);
            memberIntegralInfo.setIntegral(100);
            int addresult2=registerDao.insertMemberIntegralInfoDao(memberIntegralInfo);

            memberLogInfo.setActions(1);
            memberLogInfo.setMemberId(memId);
            memberLogInfo.setActionTime(new Date(System.currentTimeMillis()));

            int addresult3=registerDao.insertMemberLogInfoDao(memberLogInfo);
            System.out.println("会员表"+addresult);
            System.out.println("会员积分表"+addresult2);
            System.out.println("会员日志表"+addresult3);
            return "注册成功";
        }

    }
}
