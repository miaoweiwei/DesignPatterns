package com.miao.proxy;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 17:25
 * @description:
 **/
public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("这是在 Source 中的 method 方法");
    }
}