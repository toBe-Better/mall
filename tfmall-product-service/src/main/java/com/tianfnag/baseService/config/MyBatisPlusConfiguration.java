package com.tianfnag.baseService.config;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.spring.boot.starter.GlobalConfig;
import com.baomidou.mybatisplus.spring.boot.starter.MybatisPlusProperties;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Slf4j
@Configuration
@MapperScan({"com.tianfang.baseService.*.dao.**.dao"})
@AutoConfigureAfter(MybatisPlusProperties.class)
public class MyBatisPlusConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 开启 PageHelper 的支持
        paginationInterceptor.setLocalPage(true);
        return paginationInterceptor;
    }

    /**
     * SQL执行效率插件
     * 设置 dev test 环境开启
     */
    @Bean
    @Profile({"local", "dev","test"})
    @ConditionalOnMissingBean
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(10000);
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }

    @Resource
    MybatisPlusProperties mybatisPlusProperties;

    @PostConstruct
    public void setMybatisPlusProperties(){
        log.debug("setMybatisPlusProperties start");
        // 设置mapper路径
        mybatisPlusProperties.setMapperLocations(new String[]{"classpath*:/mapper/*Mapper.xml","classpath*:/mapper/**/*Mapper.xml"});
        // 设置关闭下划线，关闭大写，主键自增长
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setCapitalMode(false);
        globalConfig.setDbColumnUnderline(false);
        globalConfig.setIdType(IdType.AUTO.getKey());
        mybatisPlusProperties.setGlobalConfig(globalConfig);

    }

}

