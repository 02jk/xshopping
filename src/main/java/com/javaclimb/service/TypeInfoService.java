package com.javaclimb.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaclimb.common.ResultCode;
import com.javaclimb.entity.TypeInfo;
import com.javaclimb.exception.CustomException;
import com.javaclimb.mApper.TypeInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* 商品类别相关的Service
* */
@Service
public class TypeInfoService {

    @Resource
    private TypeInfoMapper typeInfoMapper;


    /*
    * 分页查询商品类别列表
    * */
    public PageInfo<TypeInfo> findPage(Integer pageNum, Integer pageSize, String name){
        PageHelper.startPage(pageNum,pageSize);
        List<TypeInfo> list =typeInfoMapper.findByName(name);//查询出来的所有的数据
        return PageInfo.of(list);
    }

    /*
    * 新增商品类别
    * */
    public TypeInfo add(TypeInfo typeInfo){

        typeInfoMapper.insertSelective(typeInfo);
        return typeInfo;
    }
    /*
    * 修改商品类别
    * */
    public void  update(TypeInfo typeInfo){
        typeInfoMapper.updateByPrimaryKeySelective(typeInfo);
    }

    /*
    *
    * 根据id删除商品类别
    * */
    public void delete(long id)
    {
        typeInfoMapper.deleteByPrimaryKey(id);
    }

    /*
    * 根据id获取商品类别
    * */

    public TypeInfo findById(Long id){
        return typeInfoMapper.selectByPrimaryKey(id);
    }







 }
