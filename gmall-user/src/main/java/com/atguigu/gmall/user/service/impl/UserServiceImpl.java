package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.mapper.UserReceiveAddressMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserReceiveAddressMapper userReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
//
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userReceiveAddressMapper.select(umsMemberReceiveAddress);

        Example example=new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userReceiveAddressMapper.selectByExample(example);
        return umsMemberReceiveAddresses;
    }
}
