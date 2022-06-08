package com.ool.blog_api.base.config.mybaties;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyBatiesPlusConfig {

    @Bean
    public MetaObjectHandler metaObjectHandler(){
        return new MyMetaObjectHandler();
    }

    @Bean
    public ISqlInjector injector(){
        return new LogicSqlInjector();
    }

    //分页
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }


    @Bean//在springboot启动后统一加载到spring缓存中//@component @controller @service @configuration @Respoitory 都是bean//bean 都是无状态
    @Profile({"dev","test"})
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();


        performanceInterceptor.setMaxTime(10000);
        performanceInterceptor.setFormat(true);

        return performanceInterceptor;
    }
}
