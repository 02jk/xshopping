package com.javaclimb.mApper;

import com.javaclimb.entity.GoodsInfo;
import com.javaclimb.entity.TypeInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


/*
* 商品相关的mapper
*
* */
@Repository
public interface GoodsInfoMapper extends Mapper<GoodsInfo> {
    /*根据商品名称模糊查询,或者根据id查询一个商品*/
    List<GoodsInfo> findByName(@Param("name") String name,@Param("id") Long id);

    /*查询推荐商品*/
    @Select("select * from goods_info where recommend = '是'")
    List<GoodsInfo> findRecommendGoods();
}