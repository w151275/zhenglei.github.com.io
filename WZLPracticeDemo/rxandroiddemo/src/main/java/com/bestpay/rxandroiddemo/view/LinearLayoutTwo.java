package com.bestpay.rxandroiddemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Ing. Wu on 2018/3/14.
 */

public class LinearLayoutTwo extends LinearLayout{
    public LinearLayoutTwo(Context context) {
        super(context);
    }

    public LinearLayoutTwo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("LINE_Two==","onInterceptTouchEvent");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("LINE_Two==","onTouchEvent");
        return true;
    }
}
