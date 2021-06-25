package com.miao.proxy;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 17:26
 * @description:
 **/
public class Proxy implements SourceAble {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("后置通知");
    }

    private void before() {
        System.out.println("前置通知");
    }
}
