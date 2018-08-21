package com.zxm.annotationsimple;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ZhangXinmin on 2018/8/20.
 * Copyright (c) 2018 . All rights reserved.
 * 定义一个注解
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Programmer {

    String name() default "zhangsan";

    int age();
}
