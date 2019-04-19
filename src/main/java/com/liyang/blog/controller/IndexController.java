package com.liyang.blog.controller;

import com.liyang.blog.entity.Article;
import com.liyang.blog.entity.Menu;
import com.liyang.blog.service.ArticleService;
import com.liyang.blog.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
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

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/")
    public String handleRequeset(Model model){
        HashMap<String, Object> criteria = new HashMap<>(2);
        List<Article> articleList =
                articleService.pageArticle(1, 10, criteria);
        model.addAttribute("articleList", articleList);
        return "Home/index";
    }
    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public String page(@PathVariable("id") Integer id,  Model model){
        Article article = articleService.getArticleById(id);
        model.addAttribute("article", article);
        return "Home/Page/articleDetail";
    }
}
