package com.tianfnag.baseService.product.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tianfnag.baseService.product.dao.ProductDao;
import com.tianfnag.baseService.product.entity.ProductEntity;
import com.tianfnag.baseService.product.service.ProductService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<ProductEntity> getProduct() {
        String productCode="P0190713162102155002";
        EntityWrapper wrapper=new EntityWrapper();
        wrapper.eq("productCode",productCode);
        return productDao.selectList(wrapper);
    }
}
