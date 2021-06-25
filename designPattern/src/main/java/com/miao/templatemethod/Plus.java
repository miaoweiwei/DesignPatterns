package com.miao.templatemethod;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 19:47
 * @description:
 **/
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}