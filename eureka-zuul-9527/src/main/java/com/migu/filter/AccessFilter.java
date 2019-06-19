package com.migu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 18:17
 */
public class AccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        try {
            // 当前请求环境
            RequestContext currentContext = RequestContext.getCurrentContext();
            HttpServletRequest request = currentContext.getRequest();
            HttpServletResponse response = currentContext.getResponse();
            response.setContentType("text/html;charset=UTF-8");
            String zh = "滚,fuck,shit,日,晶";
            String str = request.getParameter("str");
            if(str==null){
                return null;
            }
            System.out.println(str + "------------------------------------");
            if (zh.contains(str)) {
                currentContext.setSendZuulResponse(false);
                PrintWriter writer = response.getWriter();
                writer.write("禁止骂脏话");
                writer.flush();
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
