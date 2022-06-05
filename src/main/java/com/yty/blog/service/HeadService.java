package com.yty.blog.service;


import org.springframework.web.multipart.MultipartFile;

public interface HeadService {
    /**
     * 头像上传
     * @param file
     * @return
     */
    String change(MultipartFile file);
}
