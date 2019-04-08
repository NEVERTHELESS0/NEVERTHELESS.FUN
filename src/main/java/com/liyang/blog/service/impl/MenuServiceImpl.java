package com.liyang.blog.service.impl;

import com.liyang.blog.entity.Menu;
import com.liyang.blog.service.MenuService;
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
    @Override
    public List<Menu> listMenu() {
        return null;
    }

    @Override
    public Menu insertMenu(Menu menu) {
        return null;
    }

    @Override
    public void deleteMenu(Integer id) {

    }

    @Override
    public void updateMenu(Menu menu) {

    }

    @Override
    public Menu getMenuById(Integer id) {
        return null;
    }
}
