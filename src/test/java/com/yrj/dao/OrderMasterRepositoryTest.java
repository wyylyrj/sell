package com.yrj.dao;

import com.yrj.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author YIN
 * date: 2018/12/21 10:15
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    OrderMasterRepository repository;

    private final String openId = "110110";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("尹儒捷");
        orderMaster.setBuyerPhone("13000001111");
        orderMaster.setBuyerAddress("湖北宜昌");
        orderMaster.setBuyerOpenid(openId);
        orderMaster.setOrderAmount(new BigDecimal(3.2));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOpenid(){
        Pageable pageable = PageRequest.of(0,2);
        Page<OrderMaster> result = repository.findByBuyerOpenid(openId, pageable);
        Assert.assertNotEquals(0,result.getSize());
    }
}