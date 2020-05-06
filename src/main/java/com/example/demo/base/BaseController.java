package com.example.demo.base;

import com.example.demo.error.BusinessException;
import com.example.demo.error.EmBusinssError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/*
 *@name: BaseController
 *@description: 错误捕获器
 *@author: tjj
 *@time: 2020/5/6 14:31
 */
public class BaseController {

    //定义exceptionhandler解决未被controller层吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex){
        Map<String, Object> responseData = new HashMap<>();

        if (ex instanceof BusinessException){
            BusinessException businessException = (BusinessException)ex;
            responseData.put("errCode",businessException.getErrCode());
            responseData.put("errMsg",businessException.getErrMsg());

        }else {
            responseData.put("errCode", EmBusinssError.UNKNOWN_ERROR.getErrCode());
            responseData.put("errMsg",EmBusinssError.UNKNOWN_ERROR.getErrMsg());
        }

        return new ResultDto<>(ResultDto.CODE_BUZ_ERROR,"fail",null);


    }

}

