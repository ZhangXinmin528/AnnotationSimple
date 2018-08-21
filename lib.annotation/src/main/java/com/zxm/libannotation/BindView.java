package com.zxm.libannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ZhangXinmin on 2018/8/20.
 * Copyright (c) 2018 . All rights reserved.
 * 定义编译时注解：类似ButterKnife的BindView注解
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface BindView {
    int id() default -1;
}
