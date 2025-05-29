package com.quanxiaoha.xiaohashu.auth.constant;

public class RedisKeyConstants {

    private static final String VERIFICATION_CODE_KEY_PREFIX = "verification_code";

    public static String buildVerificationCodeKey(String verificationCode) {
        return VERIFICATION_CODE_KEY_PREFIX + verificationCode;
    }
}
