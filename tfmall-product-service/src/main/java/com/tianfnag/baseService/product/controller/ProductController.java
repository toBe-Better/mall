package com.tianfnag.baseService.product.controller;

import com.tianfnag.baseService.product.entity.ProductEntity;
import com.tianfnag.baseService.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("getPage")
    public ResponseEntity<List<ProductEntity>> getProduct(){
       return ResponseEntity.ok(productService.getProduct());
    }

}
