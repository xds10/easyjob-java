package com.easyjob.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Aop切片类
 */
@Aspect
@Component("operationAspect")
public class OperationAspect {
    @Pointcut
}
