package com.example.demo.controller;


import com.example.demo.entity.SysUser;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.mapper.ParkUserMapper;
import com.example.demo.model.ParkUser;
import com.example.demo.model.ParkUserExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * demo 接口开发
 */

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoMapper demoMapper;

    @Autowired
    private ParkUserMapper userMapper;

    @RequestMapping("/hello")
    public List<Map.Entry<String, Integer>> hello() throws Exception{
//        String name2 = name;
//        log.info("输出:"+name2);
//        SysUser user = demoMapper.selectUser(id);
//        log.info("测试");

        List<ParkUser> list = userMapper.selectByExample(new ParkUserExample());

        System.out.println(CountWord.mapSort(CountWord.getHighFrequencyList(list)));

        return CountWord.mapSort(CountWord.getHighFrequencyList(list));
    }


}
