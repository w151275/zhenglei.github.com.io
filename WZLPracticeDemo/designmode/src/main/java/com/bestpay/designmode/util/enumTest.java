package com.bestpay.designmode.util;

/**
 * Created by jh on 2016/7/7.
 */
public class   enumTest {

    public  static void main(String[] args){
        for (enumClazz e : enumClazz.values()) {
            System.out.println(e.toString());
        }
    }


    public enum enumClazz{
        Mon,
        Tue,
        Wen,
        Thur,
        Fri,
        Stau,
        Sun;


    }
}
