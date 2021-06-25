package com.miao.bridge;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 18:16
 * @description: Bridge 就是一个桥
 **/
public abstract class Bridge {
    private SourceAble source;

    public void method() {
        source.method();
    }

    public SourceAble getSource() {
        return source;
    }

    public void setSource(SourceAble source) {
        this.source = source;
    }
}
