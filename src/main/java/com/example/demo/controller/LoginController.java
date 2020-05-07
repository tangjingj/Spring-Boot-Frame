package com.example.demo.controller;

import com.example.demo.base.ResultDto;
import com.example.demo.error.BusinessException;
import com.example.demo.error.EmBusinssError;
import com.example.demo.jwt.JWTService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/*
 *@name: LoginController
 *@description: 登录功能
 *@author: tjj
 *@time: 2020/5/7 10:53
 */
@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private JWTService jwtService;

    @PostMapping("/login")
    public ResultDto login(@RequestParam(value = "username") String username,
                           @RequestParam(value = "password") String password,
                           HttpServletRequest request) throws BusinessException, UnsupportedEncodingException {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            throw new BusinessException(EmBusinssError.USER_Login_Fail);
        }
        //查询用户名和密码是否正确

        Map<String, String> userInfo = new HashMap<String, String>() {
            {
                put("username", username);
                put("password",password);
                //自定义参数
            }
        };
        //创建token,一小时之后过期
        String token = jwtService.createToken(userInfo, 1);
        ServletContext context = request.getServletContext();
        context.setAttribute(token, token);

        return new ResultDto(ResultDto.CODE_SUCC,"success",token);
    }


}
