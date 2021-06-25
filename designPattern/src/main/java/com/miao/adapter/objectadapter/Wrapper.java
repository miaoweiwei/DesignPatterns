package com.miao.adapter.objectadapter;

import com.miao.adapter.Source;
import com.miao.adapter.TargetAble;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 16:08
 * @description: 对象的适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 **/
public class Wrapper implements TargetAble {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("这是 Wrapper 中的 method2");
    }

    public static void main(String[] args) {
        Source source = new Source();
        TargetAble target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
