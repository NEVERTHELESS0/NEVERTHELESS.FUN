package com.liyang.blog.controller;

import com.liyang.blog.entity.Menu;
import com.liyang.blog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-09 00:05
 **/

@Controller
public class IndexController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/one")
    public String handleRequeset(Model model){
        List<Menu> menuList =  menuService.listMenu();
        System.out.println(menuList);
        model.addAttribute("msg", "这是我的第一个Spring mvc程序");
        return "/index.jsp";
    }
}
