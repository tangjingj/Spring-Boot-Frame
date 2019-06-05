package com.example.demo.controller;

import com.example.demo.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * demo freemarker+后台 开发
 * @author TJJ
 * @title: WebDemoController
 * @projectName demo
 * @description: TODO
 * @date 2019/6/5 15:57
 */
@Slf4j
@Controller
@RequestMapping("/demo")
public class WebDemoController {
    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String selectUser(Model model, @RequestParam(value="id",required=false) Integer id) {
        //添加数据model
        model.addAttribute("user", demoMapper.selectUser(id));
        log.info("查询到用户信息");
        //转发到web文件夹user.ftl
        return "user";
    }

}
