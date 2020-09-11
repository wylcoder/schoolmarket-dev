package com.sxdelta.schoolmarket.portal.service;

import com.sxdelta.schoolmarket.portal.dto.OssCallbackResult;
import com.sxdelta.schoolmarket.portal.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * Created by macro on 2018/5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy(int filetype);

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
