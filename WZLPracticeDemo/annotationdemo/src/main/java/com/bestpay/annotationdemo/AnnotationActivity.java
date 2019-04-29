package com.bestpay.annotationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bestpay.annotationdemo.annotation.TestAnnotation;
import com.bestpay.annotationdemo.util.AnnotationUtil;
import com.ccit.SecureCredential.CoreComponent.SoftMethods;
import com.ccit.SecureCredential.bean.ResultVo;
import com.ccit.SecureCredential.sdk.SDKImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Java 注解和反射
 * 注解：注解（Annotation），也叫元数据。一种代码级别的说明。
 *      它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。
 *      它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释
 *
 *
 *
 *
 *
 */
public class AnnotationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
//                ResultVo resultVo = SDKImpl.getIntence(App.context()).initSDK(account,
//                        UrlConfiguration.getInstance().getEnv().getCaUrl(), randomNum, null);
                            SoftMethods softMethods =  SoftMethods.getInstance();
                            ResultVo resultVo = SDKImpl.getIntence(AnnotationActivity.this).initSDK("18621644592",
                                    "", "", null, "", "1");
                           String  resultCode = resultVo.getResultCode();
                        } catch (Throwable e) {
                        }
                    }
                });
            }
        });
//        try {
//            Class clazz = Class.forName("com.bestpay.annotationdemo.util.AnnotationUtil");
//            Method[] methods = clazz.getDeclaredMethods();
//            for(Method method :methods){
//                Annotation[] annotations = method.getAnnotations();
//                if(annotations.length > 0){
//                    for(Annotation annotation :annotations){
//                        Log.i("ANNOTATION",""+method.getName()+"Annotation"+annotation.annotationType());
//                    }
//                }
//
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

}
