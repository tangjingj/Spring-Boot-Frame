package com.example.demo.error;

/**
 * 全局异常处理配置
 * @author: tjj
 */
public interface CommonError {
    /**
     * 获取错误编码的方法
     * @return
     */
    public int getErrCode();

    /**
     * 获取错误信息
     * @return
     */
    public String getErrMsg();

    /**
     * 设置错误信息
     * @param errMsg
     * @return
     */
    public CommonError setErrMsg(String errMsg);
}
