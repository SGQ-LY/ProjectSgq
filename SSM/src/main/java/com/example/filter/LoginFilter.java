package com.example.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Order(1)
@WebFilter(urlPatterns = "/*" ,filterName = "loginFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestURI = request.getRequestURI();
        System.out.println("获取请求路径"+requestURI);
        if(requestURI.startsWith("/login") || requestURI.startsWith("/css") || requestURI.startsWith("/js") || requestURI.startsWith("/images") || requestURI.equals("/")){
            filterChain.doFilter(request,response);
        }else {
            filterChain.doFilter(request,response);
          /* response.sendRedirect("/");*/
        }


    }

    @Override
    public void destroy() {

    }
}
