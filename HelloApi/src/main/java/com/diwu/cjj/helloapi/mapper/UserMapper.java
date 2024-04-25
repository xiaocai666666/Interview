package com.diwu.cjj.helloapi.mapper;

import com.diwu.cjj.helloapi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password}")
    User login(String username, String password);
}
