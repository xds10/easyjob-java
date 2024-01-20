package com.easyjob.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * 定义注解
 */
@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GlobalInterceptor {
    //boolean checkParams() default true;


    boolean checkParams() default true;
}
