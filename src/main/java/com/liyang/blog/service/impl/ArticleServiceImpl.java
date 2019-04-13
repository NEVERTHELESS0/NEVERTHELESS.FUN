package com.liyang.blog.service.impl;

import com.github.pagehelper.PageHelper;
import com.liyang.blog.entity.Article;
import com.liyang.blog.mapper.ArticleMapper;
import com.liyang.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-13 19:18
 **/


public class ArticleServiceImpl implements ArticleService {

    @Autowired(required = false)
    private ArticleMapper articleMapper;

    @Override
    public List<Article> pageArticle(Integer pageIndex,
                                     Integer pageSize,
                                     HashMap<String, Object> criteria) {
//        PageHelper.startPage(pageIndex, pageSize);
        List<Article> articleList = articleMapper.findAll(criteria);
        return articleList;
    }
}
