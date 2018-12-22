package com.yrj.service;

import com.yrj.dto.OrderDTO;

/**
 * @author YIN
 * date: 2018/12/22 16:22
 * description:
 */
public interface BuyerService {
    OrderDTO findOrderOne(String opengid,String orderId);
    OrderDTO cancelOrder(String opengid,String orderId);
}
