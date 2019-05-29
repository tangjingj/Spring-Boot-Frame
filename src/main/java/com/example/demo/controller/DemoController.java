package com.example.demo.controller;


import com.example.demo.entity.SysUser;
import com.example.demo.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name",required=false) String name,@RequestParam(value="id",required=false) Integer id){
        String name2 = name;
        log.info("输出:"+name2);
        SysUser user = demoMapper.selectUser(id);
        log.info("测试");
        return user.getNickname();
    }
}
