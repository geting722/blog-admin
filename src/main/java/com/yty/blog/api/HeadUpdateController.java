package com.yty.blog.api;

import com.yty.blog.common.entity.enums.ResultUtil;
import com.yty.blog.common.entity.vo.ResultMessage;
import com.yty.blog.service.HeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 杨腾宇
 * @date 2022/6/2 16:50
 * @description
 */
@RestController
@RequestMapping("head")
public class HeadUpdateController {

    @Autowired
    public HeadService headService;

    /**
     * 换头像
     * @param file
     * @return
     */
    @PostMapping("/change")
    public ResultMessage<String> changeHed(@RequestParam("file") MultipartFile file){
        return ResultUtil.data(headService.change(file));
    }

}
