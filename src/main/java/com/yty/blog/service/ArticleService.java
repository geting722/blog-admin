package com.yty.blog.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yty.blog.pojo.article.Article;

public interface ArticleService {
    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    IPage<Article> listPage(Integer pageNum, Integer pageSize);
}
