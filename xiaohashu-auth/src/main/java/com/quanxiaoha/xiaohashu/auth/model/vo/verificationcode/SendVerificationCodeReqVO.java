package com.quanxiaoha.xiaohashu.auth.model.vo.verificationcode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SendVerificationCodeReqVO {

    @NotBlank(message = "手机号不能为空")
    private String phone;
}