package com.miao.decorator;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 17:13
 * @description:
 **/
public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("这是 Source 类中的 method 方法");
    }
}
