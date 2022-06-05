package com.yty.blog.service.Impl;

import com.yty.blog.common.entity.enums.ResultCode;
import com.yty.blog.common.entity.vo.ResultMessage;
import com.yty.blog.common.exception.ServiceException;
import com.yty.blog.service.HeadService;
import com.yty.blog.util.QiniuCloudUtil;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

/**
 * @author 杨腾宇
 * @date 2022/6/2 17:55
 * @description
 */
@Service
public class HeadServiceImpl implements HeadService {

    /**
     *
     * @param avatar
     * @return
     */
    @SneakyThrows
    @Override
    public String change(MultipartFile avatar) {
        if (avatar.isEmpty()) {
            throw new ServiceException(ResultCode.PARAMS_ERROR);
        }
        byte[] bytes = avatar.getBytes();
        String imageName = UUID.randomUUID().toString();
        QiniuCloudUtil qiniuUtil = new QiniuCloudUtil();
        //使用base64方式上传到七牛云
        String url = qiniuUtil.put64image(bytes, imageName);
        return url;
    }
}
