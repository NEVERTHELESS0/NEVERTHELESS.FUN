package com.liyang.blog.service.impl;

import com.liyang.blog.entity.Menu;
import com.liyang.blog.mapper.MenuMapper;
import com.liyang.blog.service.MenuService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-08 21:28
 **/

@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> listMenu() {
        List<Menu> menuList = menuMapper.listMenu();
        return menuList;
    }
//    @Test
    public void main(){
        System.out.println(menuMapper.listMenu());
    }
}
