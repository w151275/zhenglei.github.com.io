package com.bestpay.rxandroiddemo.util;

import android.graphics.Bitmap;

import com.bestpay.rxandroiddemo.bean.Course;
import com.bestpay.rxandroiddemo.bean.Student;

import rx.Observable;
import rx.Observer;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * RxAndroid 变换
 *
 *
 * Created by wuzhenglei on 2016/7/26.
 */
public class RxAndroidChange {

    /**
     * 简单的事件类型变换
     */
    private void initChangeMap(){
        Observable.just("images/logo.png") // 输入类型 String
                .map(new Func1<String, Bitmap>() {
                    @Override
                    public Bitmap call(String filePath) { // 参数类型 String
                        return getBitmapFromPath(filePath); // 返回类型 Bitmap
                    }
                })
                .subscribe(new Action1<Bitmap>() {
                    @Override
                    public void call(Bitmap bitmap) { // 参数类型 Bitmap
                    }
                });
    }

    private Bitmap getBitmapFromPath(String filepath){
        return null;
    }


    //将student转换成课程的对象
    private Student student;
    private void initChangeFlatmap(){
        student = new Student();
        student.setCourse(new Course("数学","20"));
        Observable.just(student).flatMap(new Func1<Student, Observable<Course>>() {
            @Override
            public Observable<Course> call(Student student) {
                return Observable.just(student.getCourse());
            }
        }).subscribe(new Action1<Course>() {
            @Override
            public void call(Course course) {

            }
        });
    }
}
