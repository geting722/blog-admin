package com.yty.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yty.blog.pojo.user.User;

public interface UserService {

    IPage<User> listPage(Integer pageNum, Integer pageSize);

    User getUserById(Integer id);

    Boolean update(Integer id,User user);
}
