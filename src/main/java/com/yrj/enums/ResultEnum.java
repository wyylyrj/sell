package com.yrj.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YIN
 * date: 2018/12/21 14:44
 * description:
 */
@Getter
@AllArgsConstructor
public enum  ResultEnum {
    //定义错误枚举
    PRODUCT_NOT_EXIT(10,"商品不存在！"),
    PRODUCT_STOCK_ERROR(11,"商品库存不足！");

    private Integer code;
    private String msg;
}
