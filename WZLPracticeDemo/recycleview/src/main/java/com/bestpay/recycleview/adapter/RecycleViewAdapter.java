package com.bestpay.recycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bestpay.recycleview.R;
import com.bestpay.recycleview.bean.RecycleBean;

import java.util.List;

/**
 * RecycleView 的万能适配器
 * Created by wuzhenglei on 2016/7/13.
 */
public class RecycleViewAdapter<T> extends RecyclerView.Adapter<RecycleViewHolder>{

    protected Context mContext;
    protected int mLayoutId;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    public RecycleViewAdapter(Context context,int layoutId,List<T> datas){
        this.mContext = context;
        this.mLayoutId = layoutId;
        this.mDatas = datas;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleViewHolder viewHolder = RecycleViewHolder.get(mContext,parent,mLayoutId);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        RecycleBean bean = (RecycleBean) mDatas.get(position);
        holder.setText(R.id.tv_recycle,bean.getContent());
        holder.setImageResource(R.id.iv_recycle,bean.getDrawableID());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
