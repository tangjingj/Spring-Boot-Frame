package com.example.demo.utils;

import com.example.demo.jwt.Payload;

/*
 *@name: ContextUtil
 *@description: ThreadLocal工具类，用来获取请求用户的信息
 *@author: tjj
 *@time: 2020/5/6 15:19
 */
public class ContextUtil {
    //线程局部变量
    private static ThreadLocal<Payload> threadLocal = new ThreadLocal<Payload>();

    public static Payload getCurrentUser() {
        return threadLocal.get();
    }

    public static void setCurrentUser(Payload payload) {
        threadLocal.set(payload);
    }

    public static void clear() {
        threadLocal.remove();
    }
}
