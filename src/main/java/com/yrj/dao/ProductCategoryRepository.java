package com.yrj.dao;

import com.yrj.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author YIN
 * date: 2018/12/19 14:43
 * description:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findProductCategoriesByCategoryTypeIn(List<Integer> list);
}
