package com.miao.bridge;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 18:17
 * @description:
 **/
public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
