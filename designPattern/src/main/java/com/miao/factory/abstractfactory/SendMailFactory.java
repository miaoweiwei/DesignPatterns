package com.miao.factory.abstractfactory;

import com.miao.factory.MailSender;
import com.miao.factory.Sender;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:01
 * @description:
 **/
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
