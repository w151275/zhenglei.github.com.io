package com.bestpay.designmode.util;

import com.bestpay.designmode.interfacee.ICelveOne;
import com.bestpay.designmode.interfacee.ICelveTwo;

/**
 * Created by wuzhenglei on 2016/7/12.
 */
public  class CelveModeUtil {

    private ICelveOne one;
    private ICelveTwo two;

    public CelveModeUtil setTwo(ICelveTwo two) {
        this.two = two;
        return this;
    }


    public CelveModeUtil setOne(ICelveOne one) {
        this.one = one;
        return this;
    }

    public void excOne(){
        one.celveone();
    }

    public void excTwo(){
        two.celvetwo();
    }
}
