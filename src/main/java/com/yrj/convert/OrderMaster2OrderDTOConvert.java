package com.yrj.convert;

import com.yrj.dto.OrderDTO;
import com.yrj.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConvert {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
         return orderMasterList.stream().map(e ->
                    convert(e)
                ).collect(Collectors.toList());

    }
}
