package com.tianfnag.baseService.product.dao;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tianfnag.baseService.product.entity.ProductEntity;
import com.tianfnag.baseService.product.mapper.ProductMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Service
public class ProductDao extends ServiceImpl<ProductMapper,ProductEntity> {
}
