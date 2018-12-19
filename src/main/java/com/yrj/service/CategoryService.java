package com.yrj.service;

import com.yrj.entity.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer id);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryType(List<Integer> list);
    ProductCategory save(ProductCategory category);
}
