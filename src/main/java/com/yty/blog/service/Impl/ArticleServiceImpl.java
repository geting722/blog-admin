package com.yty.blog.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yty.blog.dao.ArticleMapper;
import com.yty.blog.pojo.article.Article;
import com.yty.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杨腾宇
 * @date 2022/6/2 15:34
 * @description
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public IPage<Article> listPage(Integer pageNum, Integer pageSize) {
        if (pageNum == 0 && pageSize == 0)return null;
        IPage<Article> iPage =new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<Article> queryWrapper =new LambdaQueryWrapper<>();
        iPage = articleMapper.selectPage(iPage,queryWrapper);
        return iPage;
    }
}
