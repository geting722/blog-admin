package com.yty.blog.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yty.blog.common.entity.enums.ResultUtil;
import com.yty.blog.common.entity.vo.ResultMessage;
import com.yty.blog.pojo.user.User;
import com.yty.blog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 杨腾宇
 * @date 2022/6/2 11:05
 * @description
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/getList")
    public ResultMessage<IPage<User>> getList(@RequestParam("pageNum") Integer pageNum,
                                              @RequestParam("pageSize") Integer pageSize) {
        IPage<User> ipage = userService.listPage(pageNum, pageSize);
        return ResultUtil.data(ipage);
    }

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/getUser/{id}")
    public ResultMessage<User> getUserById(
            @PathVariable Integer id
    ){
        return ResultUtil.data(userService.getUserById(id));
    }

    @PutMapping("/update/{id}")
    public  ResultMessage update(@PathVariable Integer id,@RequestBody User user){
        userService.update(id,user);
        return ResultUtil.success();
    }

}
