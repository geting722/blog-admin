package com.yty.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨腾宇
 * @date 2022/6/1 17:33
 * @description
 */
@Configuration
@MapperScan("com.yty.blog.dao")
public class MybatisPlusConfig {
}
