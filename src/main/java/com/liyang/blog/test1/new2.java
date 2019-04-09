package com.liyang.blog.test1;

import com.liyang.blog.service.MenuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-08 23:58
 **/


public class new2 {
    @Test
    public void main(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/spring-service.xml");
        MenuService menuService = (MenuService)applicationContext.getBean("menuService");
        System.out.println(menuService);
    }
}
