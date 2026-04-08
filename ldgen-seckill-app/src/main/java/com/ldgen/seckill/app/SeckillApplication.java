package com.ldgen.seckill.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: ldgen
 * @Date: 2026/3/31 21:40
 * @Version: v1.0.0
 * @Description: 秒杀系统启动类
 **/
@SpringBootApplication
@ComponentScan({"com.ldgen.seckill.*"}) // 多模块项目中，必需手动指定扫描 com.ldgen.seckill 包下面的所有类
@MapperScan("com.ldgen.seckill.common.mapper")
public class SeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
    }
}
