package com.xuejinwei.numberkeyboard.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jh on 2016/6/14.
 */
public class TestFragment extends Fragment{

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("FRAGMENT","onAttach===");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FRAGMENT","onCreate===");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("FRAGMENT","onCreateView===");
        View view = inflater.inflate(R.layout.activity_main,null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FRAGMENT","onActivityCreated===");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("FRAGMENT","onViewCreated===");
    }

}
