package com.ohgiraffers.transactional.section01.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.transactional", annotationClass = Mapper.class)
public class MyBatisConfiguration {
}
