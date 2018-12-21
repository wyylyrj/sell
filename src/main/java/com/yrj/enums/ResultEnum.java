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
    PRODUCT_STOCK_ERROR(11,"商品库存不足！"),
    ORDER_NOT_EXIT(12,"订单不存在！"),
    ORDER_DETAIL_NOT_EXIT(13,"订单明细不存在！");

    private Integer code;
    private String msg;
}
