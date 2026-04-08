package com.ldgen.seckill.common.aspect;


import java.lang.annotation.*;

/**
 * 自定义注解，用于标识需要记录操作日志的方法
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {

    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";
}
