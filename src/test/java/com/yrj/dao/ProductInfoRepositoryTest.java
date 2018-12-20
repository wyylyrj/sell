package com.yrj.dao;

import com.yrj.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author YIN
 * date: 2018/12/20 09:04
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    ProductInfoRepository productInfoRepository;

    @Test
    public void save(){
        ProductInfo info = new ProductInfo();
        info.setProductId("123456");
        info.setProductName("皮蛋粥");
        info.setProductPrice(new BigDecimal(3.2));
        info.setProductStock(100);
        info.setProductStatus(0);
        info.setProductDescription("很好喝");
        info.setProductIcon("http://xxxxxxxx.jpg");
        info.setCategoryType(5);
        productInfoRepository.save(info);
    }

    @Test
    public void findByProductStatus(){
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0,byProductStatus.size());
    }
}