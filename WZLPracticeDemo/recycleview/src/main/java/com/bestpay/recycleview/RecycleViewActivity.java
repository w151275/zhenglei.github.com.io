package com.bestpay.recycleview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bestpay.recycleview.adapter.CommonAdapter;
import com.bestpay.recycleview.adapter.MultiItemTypeAdapter;
import com.bestpay.recycleview.adapter.RecycleViewAdapter;
import com.bestpay.recycleview.adapter.ViewHolder;
import com.bestpay.recycleview.bean.RecycleBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 打造recycleView通用的适配器
 * Created by wuzhenglei on 2016/7/13.
 */
public class RecycleViewActivity extends Activity{
    private RecyclerView recyclerView;
    private List<RecycleBean> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview_lay);
        list = new ArrayList<>();
        getdata();
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final RecycleViewAdapter<RecycleBean> adapter = new RecycleViewAdapter<>(this,R.layout.item_recycle_lay,list);
        recyclerView.setAdapter(adapter);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getdata();
                adapter.notifyItemChanged(3);
            }
        });
    }


    private void getdata(){
        list.add(new RecycleBean(R.mipmap.bank_logo_bei_jing,"北京银行"));
        list.add(new RecycleBean(R.mipmap.bank_logo_china,"中国银行"));
        list.add(new RecycleBean(R.mipmap.bank_logo_gong_shang,"工商银行"));
        list.add(new RecycleBean(R.mipmap.bank_logo_guang_da,"光大银行"));
        list.add(new RecycleBean(R.mipmap.bank_logo_guang_zhou,"广州银行"));
        list.add(new RecycleBean(R.mipmap.bank_logo_hua_sha,"华夏银行"));
    }

}
