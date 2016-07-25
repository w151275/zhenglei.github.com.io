package com.bestpay.designmode.mode;

/**
 * Created by jh on 2016/7/7.
 */
public class OneProduct extends Product{
    public void action(){
        System.out.print("+++++++好酸+++++++");
    }

    @Override
    public void print(){
        System.out.print("abcdddddd");
    }
}
