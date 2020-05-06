package com.example.demo.config;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.example.demo.jwt.JWTService;
import com.example.demo.jwt.Payload;
import com.example.demo.utils.ContextUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *@name: LoginInterceptor
 *@description:
 *@author: tjj
 *@time: 2020/5/6 15:17
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 当前激活的配置文件
     */
//    @Value("${spring.profiles.active}")
//    private String env;


    private JWTService jwtService;

    public LoginInterceptor(JWTService jwtService) {
        this.jwtService = jwtService;
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        //认证验证
//        if ("dev".equals(env)) { //开发环境忽略签名认证
//            return true;
//        }

        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "text/html;charset=UTF-8");
        String token = request.getHeader("X-Auth-Token");

        //token is null
        if (StringUtils.isEmpty(token)) {
            String url = "/toLogin";
            response.sendRedirect(url);
            return false;
        }

        String tokenInServletContext = (String)request.getServletContext().getAttribute(token);

        //未登录或者过期   ServletContext中找不到这个token
        if(StringUtils.isEmpty(tokenInServletContext)) {
            String url = "/toLogin";
            response.sendRedirect(url);
            return false;
        }

        try {
            //校验token，如果无误放行
            Payload payload = jwtService.verifyToken(token);
            ContextUtil.setCurrentUser(payload);//将payload存入threadLocal
        } catch (AlgorithmMismatchException e) {
            System.err.println("Token Checkout processing AlgorithmMismatchException 异常！"+e.getLocalizedMessage());
        }catch (TokenExpiredException e) {
            System.err.println("token已经过期");
        }catch (SignatureVerificationException e) {
            System.err.println("Token Checkout processing SignatureVerificationException 异常！"+e.getLocalizedMessage());
        }catch (Exception e) {
            System.err.println("Token Checkout processing 未知异常！"+e.getLocalizedMessage());
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
