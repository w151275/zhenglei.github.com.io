package com.bestpay.annotationdemo.util;

import android.util.Log;

import com.bestpay.annotationdemo.annotation.TestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by wuzhenglei on 2016/7/27.
 */
public class AnnotationUtil {

    @TestAnnotation(name="String")
    private void load(){

        Log.i("AnnotationUtil===","load");
    }

    @TestAnnotation(sex = TestAnnotation.Sex.female)
    private void init(){
        Log.i("AnnotationUtil===","init");
    }

    public static void main(String[] args){
        try {
            Class clazz = Class.forName("com.bestpay.annotationdemo.util.AnnotationUtil");
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method :methods){
                Annotation[] annotations = method.getDeclaredAnnotations();
                if(annotations.length > 0){
                    for(Annotation annotation :annotations){
                        System.out.println(method.getName()+"Annotation"+annotation.annotationType());
                    }
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
