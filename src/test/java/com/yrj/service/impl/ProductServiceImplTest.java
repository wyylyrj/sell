package com.yrj.service.impl;

import com.yrj.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author YIN
 * date: 2018/12/20 09:38
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    ProductServiceImpl psi;

    @Test
    public void findOne() {
        ProductInfo one = psi.findOne("123456");
        Assert.assertEquals("123456",one.getProductId());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = PageRequest.of(0,2);;
        Page<ProductInfo> all = psi.findAll(pageRequest);
        Assert.assertNotEquals(0,all.getSize());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = psi.findUpAll();
        Assert.assertNotEquals(0,upAll.size());
    }

    @Test
    public void save() {
        ProductInfo info = new ProductInfo();
        info.setProductId("123457");
        info.setProductName("皮皮虾");
        info.setProductPrice(new BigDecimal(3.2));
        info.setProductStock(100);
        info.setProductStatus(1);
        info.setProductDescription("很好吃");
        info.setProductIcon("http://xxxxxxxx.jpg");
        info.setCategoryType(1);
        ProductInfo save = psi.save(info);
        Assert.assertNotNull(save);
    }
}