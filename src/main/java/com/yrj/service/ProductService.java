package com.yrj.service;

import com.yrj.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author YIN
 * date: 2018/12/20 09:30
 * description:
 */
public interface ProductService {
    ProductInfo findOne(String productId);
    Page<ProductInfo> findAll(Pageable pageable);
    List<ProductInfo> findUpAll();
    ProductInfo save(ProductInfo productInfo);
}
