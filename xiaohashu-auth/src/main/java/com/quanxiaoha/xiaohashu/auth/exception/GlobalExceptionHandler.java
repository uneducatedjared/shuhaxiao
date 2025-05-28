package com.quanxiaoha.xiaohashu.auth.exception;

import com.quanxiaoha.framework.common.exception.BizException;
import com.quanxiaoha.framework.common.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有未知异常
     */
    @ExceptionHandler(Exception.class)
    public Response<String> handleException(Exception e) {
        log.error("系统异常", e);
        return Response.fail("系统异常，请联系管理员");
    }

    /**
     * 处理业务异常
     */
    @ExceptionHandler(BizException.class)
    public Response<String> handleBizException(BizException e) {
        log.error("业务异常", e);
        return Response.fail(e.getErrorCode(), e.getErrorMsg());
    }
} 