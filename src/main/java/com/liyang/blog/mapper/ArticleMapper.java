package com.liyang.blog.mapper;

import com.liyang.blog.entity.Article;

import java.util.HashMap;
import java.util.List;

public interface ArticleMapper {

    List<Article> findAll(HashMap<String, Object> criteria);

}
