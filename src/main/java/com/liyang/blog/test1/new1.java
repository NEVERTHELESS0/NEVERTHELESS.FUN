package com.liyang.blog.test1;

import com.liyang.blog.entity.Article;
import com.liyang.blog.entity.Menu;
import com.liyang.blog.mapper.ArticleMapper;
import com.liyang.blog.mapper.MenuMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-07 19:43
 **/


public class new1 {
    @Test
    public void main(){
        ApplicationContext act =
                new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
//        MenuMapper menuMapper = act.getBean(MenuMapper.class);
//        List<Menu> menu = menuMapper.listMenu();
//        System.out.println(menu);

        ArticleMapper articleMapper = act.getBean(ArticleMapper.class);
        HashMap<String, Object> criteria = new HashMap<>(2);
        List<Article> article = articleMapper.findAll(criteria);
        System.out.println(article);
    }
}
