package com.example.demo.common;

import com.github.pagehelper.PageInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

/*
 *@name: PageHelper
 *@description: 分页插件配置
 *@author: tjj
 *@time: 2020/5/6 14:59
 */
@Component
public class PageHelper {
    @Value("${pagehelper.helperDialect}")
    private String helperDialect;

    @Value("${pagehelper.reasonable}")
    private String reasonable;

    @Value("${pagehelper.supportMethodsArguments}")
    private String supportMethodsArguments;

    @Value("${pagehelper.params}")
    private String params;

    @Value("${pagehelper.returnPageInfo}")
    private String returnPageInfo;

    @Bean
    public PageInterceptor pageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", helperDialect);
        properties.setProperty("supportMethodsArguments", supportMethodsArguments);
        properties.setProperty("params", params);
        properties.setProperty("reasonable", reasonable);
        properties.setProperty("returnPageInfo", returnPageInfo);
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }
}
