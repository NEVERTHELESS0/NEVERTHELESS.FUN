package com.liyang.blog.interceptor;

import com.liyang.blog.entity.Menu;
import com.liyang.blog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import java.util.List;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-09 11:42
 **/


public class HomeResourceInterceptor implements WebRequestInterceptor {

    @Autowired
    private MenuService menuService;

    @Override
    public void preHandle(WebRequest request) throws Exception {
        List<Menu> menuList = menuService.listMenu();
        request.setAttribute("menuList", menuList, WebRequest.SCOPE_REQUEST);
    }

    @Override
    public void postHandle(WebRequest request, ModelMap model) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest request, Exception ex) throws Exception {

    }
}
