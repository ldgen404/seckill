package com.ldgen.seckill.common.exception;

/**
 * @author: ldgen
 * @date: 2023-08-15 9:54
 * @description: 通用异常接口
 **/
public interface BaseExceptionInterface {
    /**
     * 返回错误码，如 "10001"，前端可以根据错误码做不同的逻辑处理（比如跳转登录页、弹出提示框等）；
     *
     * @return
     */
    String getErrorCode();


    /**
     * 返回错误信息，如 "参数错误"，可以直接展示给用户看；
     *
     * @return
     */
    String getErrorMessage();
}
