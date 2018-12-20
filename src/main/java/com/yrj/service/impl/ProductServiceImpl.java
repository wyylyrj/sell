package com.yrj.service.impl;

import com.yrj.dao.ProductInfoRepository;
import com.yrj.entity.ProductInfo;
import com.yrj.enums.ProductStatusEnum;
import com.yrj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YIN
 * date: 2018/12/20 09:35
 * description:
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductInfoRepository repository;
    @Override
    public ProductInfo findOne(String productId) {
        return repository.getOne(productId);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
