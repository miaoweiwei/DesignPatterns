package com.miao.factory.ordinary;

import com.miao.factory.MailSender;
import com.miao.factory.SendType;
import com.miao.factory.Sender;
import com.miao.factory.SmsSender;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 14:28
 * @description: 普通工厂模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 **/
public class OrdinaryFactory {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
//        Sender sender = sendFactory.produce(SendType.EMAIL);
        Sender sender = sendFactory.produce(SendType.SMS);
        sender.send("Hello");
    }
}


// 发送信息的工厂
class SendFactory {
    public Sender produce(SendType sendType) {
        if (SendType.EMAIL.equals(sendType)) {
            return new MailSender();
        } else if (SendType.SMS.equals(sendType)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}

