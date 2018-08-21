package com.zxm.annotationsimple;

import android.support.annotation.MainThread;

/**
 * Created by ZhangXinmin on 2018/8/20.
 * Copyright (c) 2018 . All rights reserved.
 * 注解测试
 */

public class AnnotationTest {

    @GET(value = "https://www.jd.com/")
    public String getIp() {
        return "";
    }
}
