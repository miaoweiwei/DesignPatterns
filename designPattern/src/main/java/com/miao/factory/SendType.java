package com.miao.factory;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 14:58
 * @description:
 **/ // 要发送信息的类型
public enum SendType {
    EMAIL("email"),
    SMS("sms"),
    ;

    String sendType;

    SendType(String sendType) {
        this.sendType = sendType;
    }
}
