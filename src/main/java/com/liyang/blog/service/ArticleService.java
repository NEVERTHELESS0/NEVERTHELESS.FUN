package com.liyang.blog.service;

import com.liyang.blog.entity.Article;

import java.util.HashMap;
import java.util.List;

public interface ArticleService {
    public List<Article> pageArticle(Integer pageIndex,
                                     Integer pageSize,
                                     HashMap<String, Object> criteria);

    public Article getArticleById(Integer articleId);
}
