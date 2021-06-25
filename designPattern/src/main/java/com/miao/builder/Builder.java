package com.miao.builder;

import com.miao.factory.MailSender;
import com.miao.factory.Sender;
import com.miao.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:27
 * @description: 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象
 **/
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
