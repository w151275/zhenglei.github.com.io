package com.xuejinwei.numberkeyboard.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVITY","onResume===");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ACTIVITY","onRestart===");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVITY","onPause===");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVITY","onStop===");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACTIVITY","onDestroy===");
    }
}
