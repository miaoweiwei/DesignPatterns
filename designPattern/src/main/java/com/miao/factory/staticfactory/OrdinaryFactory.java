package com.miao.factory.staticfactory;


import com.miao.factory.MailSender;
import com.miao.factory.Sender;
import com.miao.factory.SmsSender;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 14:28
 * @description: 静态工厂模式
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 **/
public class OrdinaryFactory {
    public static void main(String[] args) {
        SendFactory2.produceMail().send("Hello");
    }
}


class SendFactory2 {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}

