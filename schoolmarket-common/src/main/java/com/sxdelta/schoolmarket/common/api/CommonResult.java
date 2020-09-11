package com.sxdelta.schoolmarket.common.api;

/**
 * 通用返回对象
 * Created by macro on 2019/4/19.
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> success(T data) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(com.sxdelta.schoolmarket.common.api.ResultCode.SUCCESS.getCode(), com.sxdelta.schoolmarket.common.api.ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> success(T data, String message) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(com.sxdelta.schoolmarket.common.api.ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> failed(com.sxdelta.schoolmarket.common.api.IErrorCode errorCode) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param message 错误信息
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> failed(com.sxdelta.schoolmarket.common.api.IErrorCode errorCode, String message) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(errorCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> failed(String message) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(com.sxdelta.schoolmarket.common.api.ResultCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> failed() {
        return failed(com.sxdelta.schoolmarket.common.api.ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> validateFailed() {
        return failed(com.sxdelta.schoolmarket.common.api.ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> validateFailed(String message) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(com.sxdelta.schoolmarket.common.api.ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> unauthorized(T data) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(com.sxdelta.schoolmarket.common.api.ResultCode.UNAUTHORIZED.getCode(), com.sxdelta.schoolmarket.common.api.ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> com.sxdelta.schoolmarket.common.api.CommonResult<T> forbidden(T data) {
        return new com.sxdelta.schoolmarket.common.api.CommonResult<T>(com.sxdelta.schoolmarket.common.api.ResultCode.FORBIDDEN.getCode(), com.sxdelta.schoolmarket.common.api.ResultCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
