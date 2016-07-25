package com.bestpay.designmode.util;

import com.bestpay.designmode.interfacee.IObserved;
import com.bestpay.designmode.interfacee.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者的实现类
 * Created by wuzhenglei on 2016/7/11.
 */
public class ObservedImp implements IObserved{
    List<IObserver> observerList = new ArrayList<>();

    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unRegister(IObserver observer) {
        int index = observerList.indexOf(observer);
        if(index>0){
            observerList.remove(index);
        }
    }

    @Override
    public void post(String msg) {
        int i =0 ;
       for(IObserver observer :observerList){
           ++i;
           observer.update(msg+""+i);
       }
    }
}
