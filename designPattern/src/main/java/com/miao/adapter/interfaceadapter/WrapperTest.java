package com.miao.adapter.interfaceadapter;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 16:29
 * @description:
 **/
public class WrapperTest {
    public static void main(String[] args) {
        SourceAble source1 = new SourceSub1();
        SourceAble source2 = new SourceSub2();

        source1.method1();
        source1.method2(); //这个方法在  SourceSub1没有实现 ，所以执行的是Wrapper2中的 method2
        source2.method1(); // 这个方法在  SourceSub1没有实现 ，所以执行的是Wrapper2中的 method2
        source2.method2();
    }
}
