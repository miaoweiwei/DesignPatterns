package com.miao.adapter;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:44
 * @description: 类的适配器模式
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 **/
public interface TargetAble {
    /* 与原类中的方法相同 */
    public void method1();

    /* 新类的方法 */
    public void method2();
}
