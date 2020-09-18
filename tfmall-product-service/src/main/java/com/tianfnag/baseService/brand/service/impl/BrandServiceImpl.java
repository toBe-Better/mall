package com.tianfnag.baseService.brand.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tianfnag.baseService.brand.dao.BrandDao;
import com.tianfnag.baseService.brand.entity.BrandEntity;
import com.tianfnag.baseService.brand.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<BrandEntity> getBrandList() {
        int brandId=1;
        EntityWrapper wrapper=new EntityWrapper();
        wrapper.eq("brandId",brandId);
        return brandDao.selectList(wrapper);
    }
}
