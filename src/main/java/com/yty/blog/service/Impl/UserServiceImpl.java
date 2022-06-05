package com.yty.blog.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yty.blog.common.entity.enums.ResultCode;
import com.yty.blog.common.exception.ServiceException;
import com.yty.blog.dao.UserMapper;
import com.yty.blog.pojo.user.User;
import com.yty.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 杨腾宇
 * @date 2022/6/2 10:59
 * @description
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 用户的分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public IPage<User> listPage(Integer pageNum, Integer pageSize) {
        if (pageNum == 0 && pageSize == 0)return null;
        IPage<User> iPage =new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<User>queryWrapper =new LambdaQueryWrapper<>();
        iPage = userMapper.selectPage(iPage,queryWrapper);
        return iPage;
    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @Override
    public User getUserById(Integer id) {
        if(id >= 0)throw new ServiceException(ResultCode.PARAMS_ERROR);
        return userMapper.selectById(id);
    }

    /**
     * 修改用户信息
     * @param id
     * @param user
     */
    @Override
    public Boolean update(Integer id, User user) {
        if(id >= 0)throw new ServiceException(ResultCode.PARAMS_ERROR);
        return userMapper.updateById(user) > 0;
    }
}
