package com.orange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: MybatisPlusDemo
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 15:19
 **/
@SpringBootApplication
//@MapperScan("com.orange.dao")     //在dao层使用@Mapper和这个注解是一样的，可以两个都是用
public class MybatisDemo {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemo.class, args);
    }

}
