package com.bestpay.designmode;

import android.app.Activity;
import android.os.Bundle;

import com.bestpay.designmode.util.InstanceUtil;

/**
 * 单例模式
 *  1.恶汉式单例模式
 *  2.懒汉式单例模式
 *  3.内部类模式
 *  4.枚举模式
 *
 *
 * Created by wuzhenglei on 2016/7/7.
 */
public class InstanceActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InstanceUtil.getInstance1();
        InstanceUtil.getInstance2();
        InstanceUtil.getInstance3();
        InstanceUtil.getInstance4();
        InstanceUtil.getInstance5();
    }
}
