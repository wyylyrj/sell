package com.yrj.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YIN
 * date: 2018/12/20 09:46
 * description:
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架");

    private Integer code;
    private String message;
}
