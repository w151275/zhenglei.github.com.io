package com.bestpay.recycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bestpay.recycleview.R;

/**
 * Created by wuzhenglei on 2016/7/13.
 */
public class RecycleViewHolder extends RecyclerView.ViewHolder{


    //那么对于不同的ItemType肯定没有办法确定创建哪些成员变量View，用集合来存储
    private SparseArray<View> views;
    private View mConvertView;
    private Context mContext;
    public RecycleViewHolder(Context context, View itemView, ViewGroup parent) {
        super(itemView);
        this.mConvertView= itemView;
        views = new SparseArray<>();
        this.mContext = context;

    }


    public static RecycleViewHolder get(Context context,ViewGroup parent,int layoutId){
        View convertView = LayoutInflater.from(context).inflate(layoutId,parent,false);
        RecycleViewHolder viewHolder = new RecycleViewHolder(context,convertView,parent);
        return viewHolder;
    }


    /**
     * 通过viewId获取控件typeView
     * 根据传入的资源ID从集合里查找
     * 没有的话则存入
     *
     * @param viewId
     * @return
     */
    public <T extends View> T getView(int viewId)
    {
        View view = views.get(viewId);
        if (view == null)
        {
            view = mConvertView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }


    public RecycleViewHolder setText(int viewId, String text)
    {
        TextView tv = getView(viewId);
        tv.setText(text);
        return this;
    }

    public RecycleViewHolder setImageResource(int viewId, int resId)
    {
        ImageView view = getView(viewId);
        view.setImageResource(resId);
        return this;
    }

    public RecycleViewHolder setOnClickListener(int viewId,
                                         View.OnClickListener listener)
    {
        View view = getView(viewId);
        view.setOnClickListener(listener);
        return this;
    }
}
