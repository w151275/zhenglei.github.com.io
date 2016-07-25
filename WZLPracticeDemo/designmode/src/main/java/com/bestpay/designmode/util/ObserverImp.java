package com.bestpay.designmode.util;

import android.util.Log;

import com.bestpay.designmode.interfacee.IObserver;

/**
 * 观察者的实现类
 * Created by wuzhenglei on 2016/7/11.
 */
public class ObserverImp implements IObserver{
    @Override
    public void update(String msg) {
        Log.i("",""+msg);
    }
}
