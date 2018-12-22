package com.yrj.service.impl;

import com.yrj.dto.OrderDTO;
import com.yrj.enums.ResultEnum;
import com.yrj.exception.SellException;
import com.yrj.service.BuyerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YIN
 * date: 2018/12/22 16:24
 * description:
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    OrderServiceImpl orderService;

    @Override
    public OrderDTO findOrderOne(String opengid, String orderId) {
        return checkOrderOwner(opengid,orderId);
    }

    @Override
    public OrderDTO cancelOrder(String opengid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(opengid, orderId);
        if (orderDTO == null){
            log.error("【取消订单】查不到该订单orderId={}",orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIT);
        }
        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String opengid, String orderId){
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null){
            return null;
        }
        if (orderDTO.getBuyerOpenid().equalsIgnoreCase(opengid)){
            log.error("【查询订单】订单的opengid不一致。opengid={},orderDTO={}",opengid,orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
