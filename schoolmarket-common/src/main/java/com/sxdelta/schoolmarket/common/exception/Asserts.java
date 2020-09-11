package com.sxdelta.schoolmarket.common.exception;

import com.sxdelta.schoolmarket.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Created by macro on 2020/2/27.
 */
public class Asserts {
    public static void fail(String message) {
        throw new com.sxdelta.schoolmarket.common.exception.ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new com.sxdelta.schoolmarket.common.exception.ApiException(errorCode);
    }
}
