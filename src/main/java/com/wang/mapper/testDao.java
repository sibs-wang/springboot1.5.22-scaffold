package com.wang.mapper;

import com.wang.entity.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface testDao {
    List<User> selectAllByName(String name);
}
