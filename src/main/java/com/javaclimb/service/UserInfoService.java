package com.javaclimb.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaclimb.common.ResultCode;
import com.javaclimb.entity.UserInfo;
import com.javaclimb.exception.CustomException;
import com.javaclimb.mApper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* 用户相关的Service
* */
@Service
public class UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    /*
    * 登录
    * */
    public UserInfo login(String name,String password)
    {
        //判断数据库里是否有该用户
        List<UserInfo> list =userInfoMapper.findByName(name);
        if(CollectionUtil.isEmpty(list)){
            throw new CustomException(ResultCode.USER_NOT_EXIST_ERROR);
        }
        //判断密码是否正确
        if(!SecureUtil.md5(password).equals(list.get(0).getPassword()))
        {
            throw new CustomException(ResultCode.USER_ACCOUNT_ERROR);
        }
        return list.get(0);
    }

    /*
    * 重置密码(忘记密码)
    * */
    public UserInfo resetPassword(String name) {
        //判断数据库里是否有该用户
        List<UserInfo> list =userInfoMapper.findByName(name);
        if(CollectionUtil.isEmpty(list)){
            throw new CustomException(ResultCode.USER_NOT_EXIST_ERROR);
        }
        list.get(0).setPassword(SecureUtil.md5("123456"));
        userInfoMapper.updateByPrimaryKeySelective(list.get(0));
        return list.get(0);
    }

    /*
    * 分页查询用户列表
    * */
    public PageInfo<UserInfo> findPage(Integer pageNum, Integer pageSize, String name){
        PageHelper.startPage(pageNum,pageSize);
        List<UserInfo> list =userInfoMapper.findByName(name);//查询出来的所有的数据
        return PageInfo.of(list);
    }

    /*
    * 新增用户
    * */
    public UserInfo add(UserInfo userInfo){
        //判断用户是否已经存在
        int count = userInfoMapper.checkRepeat("name", userInfo.getName());
        if(count>0)
        {
            throw new CustomException(ResultCode.USER_EXIST_ERROR);
        }
        if(StrUtil.isBlank(userInfo.getPassword())){
            //默认密码123456
            userInfo.setPassword(SecureUtil.md5("123456"));
        }else{
            userInfo.setPassword(SecureUtil.md5(userInfo.getPassword()));
        }
        //设置新增用户为买家
        userInfo.setLevel(3);
        userInfoMapper.insertSelective(userInfo);
        return userInfo;
    }
    /*
    * 修改用户
    * */
    public void  update(UserInfo userInfo){
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    /*
    *
    * 根据id删除用户
    * */
    public void delete(long id)
    {
        userInfoMapper.deleteByPrimaryKey(id);
    }







 }
