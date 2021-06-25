package com.miao.strategy;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 19:41
 * @description: +
 **/
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\+");
        return arrayInt[0] + arrayInt[1];
    }
}