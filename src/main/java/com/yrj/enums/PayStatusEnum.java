package com.yrj.enums;

import lombok.Getter;

/**
 * @author YIN
 * date: 2018/12/21 09:58
 * description:
 */
@Getter
public enum  PayStatusEnum {
    //支付状态枚举
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付完成");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
