package com.xuejinwei.numberkeyboard.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ACTIVITY","onCreate===");
        setContentView(R.layout.activity_main);

    }


    private void changeFragent(){
        TestFragment test = new TestFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.voucher_content, test);
        transaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        changeFragent();
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
