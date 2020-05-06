package com.example.demo.error;

/*
 *@name: BusinessException
 *@description: 包装器业务异常类实现
 *@author: tjj
 *@time: 2020/5/6 14:26
 */
public class  BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    //直接接收embussinesserror的传参，用于构造业务异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }
    //接收自定义errMsg的方式构造业务异常
    public BusinessException(CommonError commonError ,String errMsg){
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}

