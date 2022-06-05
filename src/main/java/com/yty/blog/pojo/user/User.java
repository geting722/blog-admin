package com.yty.blog.pojo.user;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 杨腾宇
 * @date 2022/6/1 11:35
 * @description
 */
@Data
@AllArgsConstructor
@TableName("user")
public class User implements Serializable {
    @TableId(value = "pk_id",type = IdType.AUTO)
    private Integer id;

    @TableField("idx_name")
    private String name;

    @TableField("idx_email")
    private String email;

    @TableField("idx_password")
    private String pwd;

    @TableField("idx_sex")
    private String sex;

    @TableField("idx_birth")
    private String birth;

    @TableField("idx_head")
    private String head;

    @TableField("idx_brief")
    private String brief;

    @TableField(value = "idx_time", fill = FieldFill.INSERT)
    private Date createTime;
}
