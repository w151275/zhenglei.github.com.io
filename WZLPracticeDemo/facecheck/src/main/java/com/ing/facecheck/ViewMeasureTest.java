package com.ing.facecheck;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by Ing. Wu on 2018/7/13.
 */

public class ViewMeasureTest extends ViewGroup {
    public ViewMeasureTest(Context context) {
        super(context);
    }

    public ViewMeasureTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewMeasureTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.i("onMeasure===","");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public void draw(Canvas canvas) {
        Log.i("draw===","");
        super.draw(canvas);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        Log.i("onLayout===","");
    }
}
