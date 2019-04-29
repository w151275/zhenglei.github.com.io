package com.ing.facecheck;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Ing. Wu on 2018/7/11.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String appKey = getPackageManager().getPackageInfo(
                    getPackageName(), PackageManager.GET_SIGNATURES).signatures[0]
                    .toCharsString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
