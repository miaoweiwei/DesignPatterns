package com.miao.adapter.classadapter;

import com.miao.adapter.Source;
import com.miao.adapter.TargetAble;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:46
 * @description: 类的适配器模式
 * Adapter类继承Source类，实现Targetable接口
 * 这样Targetable接口的实现类就具有了Source类的功能。
 **/
public class Adapter extends Source implements TargetAble {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    public static void main(String[] args) {
        TargetAble target = new Adapter();
        target.method1();
        target.method2();
    }
}
