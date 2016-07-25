package com.bestpay.designmode;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.bestpay.designmode.interfacee.ICelveOne;
import com.bestpay.designmode.interfacee.ICelveTwo;
import com.bestpay.designmode.util.CelveModeUtil;

/**
 * 策略模式
 * 描述：定义一批接口，每个接口定义独一的方法体并重写实现这些方法体
 *       定义一个类批量实现这些接口方法(相当把所有的功能模块统一起来)
 * Created by wuzhenglei on 2016/7/12.
 */
public class CelveActiviity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celvemode_lay);
        CelveModeUtil celveModeUtil = new CelveModeUtil();
        celveModeUtil.setOne(new ICelveOne() {
            @Override
            public void celveone() {
                Log.i("策略模式","one");
            }
        }).setTwo(new ICelveTwo() {
            @Override
            public void celvetwo() {
                Log.i("策略模式","two");
            }
        });
        celveModeUtil.excOne();
        celveModeUtil.excTwo();
    }
}
