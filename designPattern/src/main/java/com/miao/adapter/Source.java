package com.miao.adapter;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:43
 * @description: 类的适配器模式
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 **/
public class Source {
    public void method1() {
        System.out.println("这是 Source 中的 method1");
    }
}
