package com.miao.factory.abstractfactory;

import com.miao.factory.Sender;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 15:00
 * @description:
 **/
public interface Provider {
    public Sender produce();
}
