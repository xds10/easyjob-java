package com.easyjob.annotation;

import com.easyjob.entity.enums.VerifyRegexEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface VerifyParam {
    VerifyRegexEnum regex() default VerifyRegexEnum.DEFAULT;

    int min() default -1;

    int max() default -1;

    boolean required() default false;

}
