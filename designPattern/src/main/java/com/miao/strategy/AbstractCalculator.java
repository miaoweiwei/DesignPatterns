package com.miao.strategy;

/**
 * @author: miaoweiwei1
 * @date: 2021-06-25 19:40
 * @description: AbstractCalculator是辅助类，提供辅助方法
 **/
public abstract class AbstractCalculator {

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}