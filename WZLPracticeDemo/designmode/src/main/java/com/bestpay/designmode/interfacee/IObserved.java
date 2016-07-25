package com.bestpay.designmode.interfacee;

/**
 * 被观察者
 * 描述 ：提供方法来绑定保存观察者，并在内部调用观察者的方法
 * Created by wuzhenglei on 2016/7/11.
 */
public interface IObserved {

    void register(IObserver observer);
    void unRegister(IObserver observer);
    void post(String msg);
}
