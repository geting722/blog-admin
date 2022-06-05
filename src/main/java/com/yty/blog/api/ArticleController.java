package com.yty.blog.api;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yty.blog.common.entity.enums.ResultUtil;
import com.yty.blog.common.entity.vo.ResultMessage;
import com.yty.blog.pojo.article.Article;
import com.yty.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨腾宇
 * @date 2022/6/2 15:35
 * @description
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 获取文章 （分页）
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/getList")
    public ResultMessage<IPage<Article>> getList(@RequestParam("pageNum") Integer pageNum,
                                                 @RequestParam("pageSize") Integer pageSize) {
        IPage<Article> ipage = articleService.listPage(pageNum, pageSize);
        return ResultUtil.data(ipage);
    }


}
