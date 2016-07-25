package com.bestpay.designmode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.bestpay.designmode.util.ObservedImp;
import com.bestpay.designmode.util.ObserverImp;

/**
 * 观察者模式
 * 1.观察者
 * 2.被观察者
 * 原理：被观察者通过注册与观察者之间发生联系，通过观察者发送消息通知被观察者做出相应的处理
 *
 *
 * Created by wuzhenglei on 2016/7/11.
 */
public class ObserverActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_lay);
        findViewById(R.id.btn_observer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                excObserver();
            }
        });
    }


    private void excObserver(){
        ObserverImp observerImp = new ObserverImp();
        ObservedImp obdImp = new ObservedImp();
        obdImp.register(observerImp);
        obdImp.post("注册成功了");

    }
}
