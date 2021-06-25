package com.miao.factory.abstractfactory;

import com.miao.factory.Sender;
import com.miao.factory.SmsSender;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:01
 * @description:
 **/
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}