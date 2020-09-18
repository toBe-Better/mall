package com.tianfnag.baseService.product.entity;

import com.baomidou.mybatisplus.annotations.DataSource;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("Product")
public class ProductEntity {
    private Integer id;

    private String productCode;

    private String productName;

    private String productImg;

    private String shortTitle;

    private String activityTitle;

    private String recommend;

    private Integer brandId;

    private Integer countryId;

    private Integer unitId;

    private Integer originCountryId;

    private String mainCategory;

    private String secondCategory;

    private String supplierCode;

    private String depotCode;

    private Integer attribute;

    private String upc;

    private Integer spuId;

    private String skuCode;

    private String wmsSkuCode;

    private BigDecimal costPrice;

    private BigDecimal salePrice;

    private BigDecimal markingPrice;

    private BigDecimal promotionPrice;

    private Integer maxBuyCount;

    private Integer minBuyCount;

    private Integer suitStock;

    private Integer lockStock;

    private Integer sellStock;

    private String keyWord;

    private String productType;

    private String single;

    private String hidden;

    private String putAway;

    private String freeTax;

    private Integer shippingTemplateId;

    private String delStatus;

    private Date createTime;

    private Date updateTIme;

    private Integer auditId;

    private Integer isCoupon;

    private Integer couponType;

    private BigDecimal randomSubMaxAmount;

    private Date sellStartTime;

    private Date sellEndTime;

    private Integer isRefund;

    private Integer buyIsUse;

    private String couponId;

    private Integer salesVolume;

    private  Integer complexSort;

    private Integer isReturn7Day;

    private String return7DayText;
}
