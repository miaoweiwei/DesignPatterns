package com.miao.factory;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 14:55
 * @description:
 **/
public class SmsSender implements Sender {
    @Override
    public void send(String msg) {
        System.out.println(String.format("发送短信:%s", msg));
    }
}
