package com.bestpay.rxandroiddemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Ing. Wu on 2018/3/14.
 */

public class ViewTouch  extends View{
    public ViewTouch(Context context) {
        super(context);
    }

    public ViewTouch(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("View==","onTouchEvent");
        return false;
    }
}
