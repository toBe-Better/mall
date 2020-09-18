package com.tianfnag.baseService.brand.controller;

import com.tianfnag.baseService.brand.entity.BrandEntity;
import com.tianfnag.baseService.brand.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("list")
    public ResponseEntity<List<BrandEntity>> getBrandList(){
        return ResponseEntity.ok(brandService.getBrandList());
    }
}
