package com.quanxiaoha.framework.common.exception;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BizException extends RuntimeException {
    //异常码
    private String errorCode;
    //错误信息
    private String errorMsg;

    // 实际上传入的是该接口的任意对象
    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMsg = baseExceptionInterface.getErrorMessage();
    }
}
