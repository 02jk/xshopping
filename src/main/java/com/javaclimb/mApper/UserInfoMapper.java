package com.javaclimb.mApper;

import com.javaclimb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/*用户相关的Mapper*/
@Repository
public interface UserInfoMapper extends Mapper<UserInfo> {
   /*根据用户名查询*/
   List<UserInfo> findByName(@Param("name") String name);

   /*用户唯一性判断*/
   int checkRepeat(@Param("column")String column,@Param("value")String value);
}