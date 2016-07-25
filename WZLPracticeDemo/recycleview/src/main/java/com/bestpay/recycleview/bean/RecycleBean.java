package com.bestpay.recycleview.bean;

/**
 * Created by wuzhenglei on 2016/7/15.
 */
public class RecycleBean {
    private int drawableID;
    private String content;

    public RecycleBean(int drawableID, String content) {
        this.drawableID = drawableID;
        this.content = content;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public void setDrawableID(int drawableID) {
        this.drawableID = drawableID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
