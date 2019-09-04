package com.example.demo.mapper;

import com.example.demo.model.ParkUser;
import com.example.demo.model.ParkUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ParkUserMapper {
    int countByExample(ParkUserExample example);

    int deleteByExample(ParkUserExample example);

    int insert(ParkUser record);

    int insertSelective(ParkUser record);

    List<ParkUser> selectByExample(ParkUserExample example);

    int updateByExampleSelective(@Param("record") ParkUser record, @Param("example") ParkUserExample example);

    int updateByExample(@Param("record") ParkUser record, @Param("example") ParkUserExample example);
}