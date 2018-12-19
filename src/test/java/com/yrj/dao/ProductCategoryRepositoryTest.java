package com.yrj.dao;

import com.yrj.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author YIN
 * date: 2018/12/19 14:50
 * description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository pcr;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> one = pcr.findById(1);
        System.out.println(one.toString());
    }

    @Test
    @Transactional//事物回滚
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",5);
        ProductCategory result = pcr.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest(){
        Optional<ProductCategory> one = pcr.findById(2);
        ProductCategory productCategory = one.get();
        productCategory.setCategoryType(3);
        pcr.save(productCategory);
    }

    @Test
    public void delTest(){

        pcr.deleteById(2);
    }

    @Test
    public void findByCategoryType(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> pcList = pcr.findProductCategoriesByCategoryTypeIn(list);
        Assert.assertNotEquals(0,pcList.size());
    }
}