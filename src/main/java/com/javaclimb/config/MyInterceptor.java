package com.javaclimb.config;

/*
* 如果没有登录，重定向到登录页
* 全局拦截器
* */

import com.javaclimb.common.Common;
import com.javaclimb.entity.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    /*
    * 所有访问后台的请求先从这里跳过
    * 返回true就继续执行后面的请求，返回false中断后的请求，直接转向登录页
    * */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserInfo userInfo =(UserInfo) request.getSession().getAttribute(Common.USER_INFO);
        if(userInfo==null)
        {
            //重定向到登录页
            response.sendRedirect("/end/page/login.html");
            return false;
        }
        return true;
    }
}
