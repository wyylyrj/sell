package com.yrj.enums;

import lombok.Getter;

/**
 * @author YIN
 * date: 2018/12/21 08:43
 * description:
 */
@Getter
public enum  OrderStatusEnum {
    //订单状态枚举
    NEW(0,"新订单"),

    FINISH(1,"已完结"),

    CANCEL(2,"已取消");

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }}
