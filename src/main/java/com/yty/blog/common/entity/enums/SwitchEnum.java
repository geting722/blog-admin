package com.yty.blog.common.entity.enums;

/**
 * 开关枚举
 */
public enum SwitchEnum {

    /**
     * 开关
     */
    OPEN("开启"), CLOSE("关闭");

    private final String description;

    SwitchEnum(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }


}
