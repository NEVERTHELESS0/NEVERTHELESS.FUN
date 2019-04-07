package com.liyang.blog.test1;

import com.liyang.blog.entity.Menu;
import com.liyang.blog.mapper.MenuMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        MenuMapper menuMapper = act.getBean(MenuMapper.class);
        List<Menu> menu = menuMapper.listMenu();
        System.out.println(menu);
        //
    }
}
