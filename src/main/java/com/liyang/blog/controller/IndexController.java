package com.liyang.blog.controller;

import com.liyang.blog.entity.Menu;
import com.liyang.blog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping(value = "/")
    public String handleRequeset(Model model){
        List<Menu> menuList =  menuService.listMenu();
        model.addAttribute("menuList", menuList);
        return "Home/index";
    }
}
