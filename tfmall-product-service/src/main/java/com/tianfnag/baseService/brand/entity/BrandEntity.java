package com.tianfnag.baseService.brand.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Brand")
public class BrandEntity {

    private Integer brandId;

    private String brandNameCn;

    private String brandNameEn;

    private String logo;

    private String homeLocation;

    private String introduce;

    private Integer status;

    private Integer isDelete;

    private Date createTime;

    private Date updateTime;

    private String operator;
}
