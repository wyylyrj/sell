package com.yrj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author YIN
 * date: 2018/12/21 15:34
 * description:
 */
@Data
@AllArgsConstructor
public class CartDTO {
    private String productId;
    private Integer productQuantity;
}
