package com.yty.blog.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yty.blog.pojo.article.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
