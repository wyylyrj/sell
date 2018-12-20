package com.yrj.controller;

import com.yrj.VO.ProductInfoVO;
import com.yrj.VO.ProductVO;
import com.yrj.VO.ResultVO;
import com.yrj.entity.ProductCategory;
import com.yrj.entity.ProductInfo;
import com.yrj.service.impl.CategoryServiceImpl;
import com.yrj.service.impl.ProductServiceImpl;
import com.yrj.util.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author YIN
 * date: 2018/12/20 10:16
 * description:
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    ProductServiceImpl productService;
    @Autowired
    CategoryServiceImpl categoryService;

    @GetMapping("/list")
    public ResultVO list(){

        List<ProductInfo> productInfos = productService.findUpAll();
        List<Integer> categoryTypes = productInfos.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> categories = categoryService.findByCategoryType(categoryTypes);

        List<ProductVO> productVOS = new ArrayList<>();
        for (ProductCategory category:categories
             ) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(category.getCategoryType());
            productVO.setCategoryName(category.getCategoryName());

            List<ProductInfoVO> productInfoVOS = new ArrayList<>();
            for (ProductInfo productInfo:productInfos
                 ) {
                if (productInfo.getCategoryType().equals(category.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOS.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOS);
            productVOS.add(productVO);
        }

        return ResultVOUtil.success(productVOS);

    }
}
