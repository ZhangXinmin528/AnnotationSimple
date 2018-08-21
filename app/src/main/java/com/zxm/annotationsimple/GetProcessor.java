package com.zxm.annotationsimple;

import java.lang.reflect.Method;

/**
 * Created by ZhangXinmin on 2018/8/20.
 * Copyright (c) 2018 . All rights reserved.
 */
public final class GetProcessor {
    public static void main(String[] args) {
        Method[] methods = AnnotationTest.class.getDeclaredMethods();
        for (Method method : methods) {
            GET get = method.getAnnotation(GET.class);
            System.out.println(get.value());
        }

    }
}
