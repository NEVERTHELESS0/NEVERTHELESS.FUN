package com.liyang.blog.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Menu implements Serializable {
    private static final long serialVersionUID = 489914127235951698L;
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;

    @Override

    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuLevel=" + menuLevel +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuOrder=" + menuOrder +
                '}';
    }
}