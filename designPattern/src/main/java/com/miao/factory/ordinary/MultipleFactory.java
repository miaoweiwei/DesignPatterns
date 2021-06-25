package com.miao.factory.ordinary;

import com.miao.factory.MailSender;
import com.miao.factory.Sender;
import com.miao.factory.SmsSender;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 14:41
 * @description: 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
 * 如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 * 这样就不用使用枚举去指定要创建产品的类型了
 **/
public class MultipleFactory {
    public static void main(String[] args) {
        SendFactory1 factory = new SendFactory1();
        Sender sender = factory.produceMail();
        sender.send("Hello");
    }
}

class SendFactory1 {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}