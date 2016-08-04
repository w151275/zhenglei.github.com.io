package com.bestpay.rxandroiddemo.util;

import android.util.Log;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * 在 RxJava 的默认规则中，事件的发出和消费都是在同一个线程的。
 * 也就是说，如果只用上面的方法，实现出来的只是一个同步的观察者模式。
 * 观察者模式本身的目的就是『后台处理，前台回调』的异步机制，因此异步对于 RxJava 是至关重要的。
 * 而要实现异步，则需要用到 RxJava 的另一个概念： Scheduler 。
 *
 *
 *
 * Schedulers.immediate(): 直接在当前线程运行，相当于不指定线程。这是默认的 Scheduler。
 * Schedulers.newThread(): 总是启用新线程，并在新线程执行操作。
 * Schedulers.io(): I/O 操作（读写文件、读写数据库、网络信息交互等）所使用的 Scheduler。
 *                  行为模式和 newThread() 差不多，区别在于 io() 的内部实现是是用一个无数量上限的线程池，可以重用空闲的线程，因此多数情况下 io() 比 newThread() 更有效率。
 *                  不要把计算工作放在 io() 中，可以避免创建不必要的线程。
 * Schedulers.computation(): 计算所使用的 Scheduler。这个计算指的是 CPU 密集型计算，即不会被 I/O 等操作限制性能的操作，例如图形的计算。这个 Scheduler 使用的固定的线程池，大小为 CPU 核数。不要把 I/O 操作放在 computation() 中，否则 I/O 操作的等待时间会浪费 CPU。
 * AndroidSchedulers.mainThread()，它指定的操作将在 Android 主线程运行。
 * 以上通过使用 subscribeOn() 和 observeOn() 两个方法来对线程进行控制。
 *
 *
 * Created by wuzhenglei on 2016/7/26.
 */
public class RxAndroidScheduler {

    private final String TAG = "RxAndroid";


    private void initScheduler(){
        Observable.just(1, 2, 3, 4)
                //subscribeOn(): 指定 subscribe() 所发生的线程，即 Observable.OnSubscribe 被激活时所处的线程;或者叫做事件产生的线程
                .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
                //observeOn(): 指定 Subscriber 所运行在的线程。或者叫做事件消费的线程
                .observeOn(AndroidSchedulers.mainThread()) // 指定 Subscriber 的回调发生在主线程
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer number) {
                        Log.d(TAG, "number:" + number);
                    }
                });
    }
}
