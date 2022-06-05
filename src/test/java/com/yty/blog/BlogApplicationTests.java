package com.yty.blog;

import com.yty.blog.dao.ArticleMapper;
import com.yty.blog.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Test
    void contextLoads() {
        System.out.println(articleMapper.selectById(2));
    }

}
