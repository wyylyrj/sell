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
    PARAM_ERROR(1,"参数不正确！"),
    PRODUCT_NOT_EXIT(10,"商品不存在！"),
    PRODUCT_STOCK_ERROR(11,"商品库存不足！"),
    ORDER_NOT_EXIT(12,"订单不存在！"),
    ORDER_DETAIL_NOT_EXIT(13,"订单明细不存在！"),
    ORDER_STATUS_ERROR(14,"订单状态错误！"),
    ORDER_UPDATE_FAIL(15,"订单更新失败！"),
    ORDER_DETAIL_EMPTY(16,"订单没有商品明细！"),
    ORDER_PAY_STATUS_ERROR(17,"订单支付状态错误！"),
    CART_EMPTY(18,"购物车不能为空！"),
    ORDER_OWNER_ERROR(19,"该订单不属于当前用户！"),
    WECHAT_MP_ERROR(20,"微信公众号方面错误")
    ;

    private Integer code;
    private String msg;
}
