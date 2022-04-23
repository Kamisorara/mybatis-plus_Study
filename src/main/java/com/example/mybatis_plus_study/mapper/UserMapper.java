package com.example.mybatis_plus_study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis_plus_study.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
