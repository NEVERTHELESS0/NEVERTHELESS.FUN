package com.liyang.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: LIYANG
 * @program: myBlog
 * @description: none
 * @create: 2019-04-13 16:34
 **/

@Data
public class Article implements Serializable {
    private static final long serialVersionUID = 5207865247400761539L;

    private Integer articleId;

    private String articleTitle;

    private String articleContent;

    private Integer articleViewCount;

    private Integer articleCommentCount;

    private Integer articleLikeCount;

    private Date articleCreateTime;

    private Date articleUpdateTime;
}
