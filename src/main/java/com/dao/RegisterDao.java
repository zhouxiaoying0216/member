package com.dao;

import com.entity.MemberInfo;
import com.entity.MemberIntegralInfo;
import com.entity.MemberLogInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author zxy
 * @create 2019/12/6 16:16
 */
@Mapper
public interface RegisterDao {

    int insertMemberInfoDao(MemberInfo memberInfo);


    MemberInfo selectRegisterInfoDao (MemberInfo memberInfo);

    int insertMemberIntegralInfoDao(MemberIntegralInfo memberIntegralInfo);

    int insertMemberLogInfoDao(MemberLogInfo memberLogInfo);


}
