package com.example.demo.jwt;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 *@name: Payload
 *@description: 存储声明
 *@author: tjj
 *@time: 2020/5/6 15:08
 */
@Data
public class Payload {
    private String issuer;//发布者
    private String subject;//主题
    private List<String> audience;//签名的观众 也可以理解谁接受签名的
    private Date issuedAt;//发布时间
    private Date expiresAt;//过期时间
    private Date notBefore;//开始使用时间
    private Map<String, String> claims;

    //重载这个方法
    public void setAudience(List<String> audience) {
        this.audience = audience;
    }
    public void setAudience(String... audienceStr) {
        List<String> audiences = new ArrayList<String>();
        for (String string : audienceStr) {
            audiences.add(string);
        }
        this.audience = audiences;
    }
}

