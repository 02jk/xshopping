package com.javaclimb.mApper;

import com.javaclimb.entity.TypeInfo;
import com.javaclimb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/*商品类别相关的Mapper*/
@Repository
public interface TypeInfoMapper extends Mapper<TypeInfo> {
    /*根据类别名称查询*/
    List<TypeInfo> findByName(@Param("name") String name);
}