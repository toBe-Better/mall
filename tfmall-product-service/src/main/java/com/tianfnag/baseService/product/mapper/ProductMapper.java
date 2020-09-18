package com.tianfnag.baseService.product.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tianfnag.baseService.product.entity.ProductEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<ProductEntity> {
}
