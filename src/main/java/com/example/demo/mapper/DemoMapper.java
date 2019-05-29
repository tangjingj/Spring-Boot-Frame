package com.example.demo.mapper;

import com.example.demo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {

    SysUser selectUser(Integer id);
}
