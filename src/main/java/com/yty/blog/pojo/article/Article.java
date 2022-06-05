package com.yty.blog.pojo.article;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 杨腾宇
 * @date 2022/6/1 17:24
 * @description
 */
@Data
@AllArgsConstructor
@TableName("article")
public class Article implements Serializable {

    @TableId(value = "pk_id", type = IdType.AUTO)
    private Integer id;

    @TableField("idx_title")
    private String title;

    @TableField("idx_content")
    private String content;

    @TableField("idx_author")
    private String author;

    @TableField("idx_tag")
    private String tag;

    @TableField("idx_sort")
    private String sort;

    @TableField("idx_original")
    private String original;

    @TableField("idx_collect")
    private Integer collect;

    @TableField("idx_read")
    private Integer read_count;

    @TableField("idx_comment")
    private String comment;

    @TableField("idx_like")
    private Integer like_count;

    @TableField(value = "idx_time",fill = FieldFill.INSERT)
    private Date time;

}
