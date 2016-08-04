package com.bestpay.rxandroiddemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bestpay.rxandroiddemo.bean.Course;
import com.bestpay.rxandroiddemo.bean.Student;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;


/**
 * 推荐网站：http://gank.io/post/560e15be2dca930e00da1083
 * RxJava 和RxAndroid 使用
 * RxJava 的异步实现，是通过一种扩展的观察者模式来实现的。
 *
 *基本实现：
 * 1) 创建 Observer
 *    Observer 即观察者，它决定事件触发的时候将有怎样的行为
 * 2) 创建 Observable
 *    Observable 即被观察者，它决定什么时候触发事件以及触发怎样的事件
 * 3) Subscribe (订阅)
 *    创建了 Observable 和 Observer 之后，再用 subscribe() 方法将它们联结起来，整条链子就可以工作了
 */
public class RxAndroidActivity extends Activity {

    private final String TAG = "RxAndroid";

    private Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        subscribe();
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
                Log.i(TAG,"name=="+course.getName());
            }
        });
    }

    /**
     * 创建Observer（观察者）
     * 1.实现Observer
     * 2.实现Subscribe，对Observer的实现
     */
    private Observer<String> initObserver(){
        //实现Observer
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onCompleted() {
                Log.i(TAG,"======complete");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {
                Log.i(TAG,"======onNext"+s);
            }
        };
        return observer;
    }

    private Subscriber<String> initSubcriber(){
        /**
         *
         * Subscriber是Observer的实现，自己也提供了以下两种方法
         *
         * onStart():    这是 Subscriber 增加的方法。它会在 subscribe 刚开始，而事件还未发送之前被调用;
         *               可以用于做一些准备工作，例如数据的清零或重置。
         *               这是一个可选方法，默认情况下它的实现为空。
         *               需要注意的是，如果对准备工作的线程有要求（例如弹出一个显示进度的对话框，这必须在主线程执行）， onStart() 就不适用了，因为它总是在 subscribe 所发生的线程被调用，而不能指定线程。
         *               要在指定的线程来做准备工作，可以使用 doOnSubscribe() 方法，具体可以在后面的文中看到。
         *unsubscribe(): 这是 Subscriber 所实现的另一个接口 Subscription 的方法，用于取消订阅。
         *               在这个方法被调用后，Subscriber 将不再接收事件。
         *               一般在这个方法调用前，可以使用 isUnsubscribed() 先判断一下状态。
         *               unsubscribe() 这个方法很重要，因为在 subscribe() 之后， Observable 会持有 Subscriber 的引用，这个引用如果不能及时被释放，将有内存泄露的风险。
         *               所以最好保持一个原则：要在不再使用的时候尽快在合适的地方（例如 onPause() onStop() 等方法中）调用 unsubscribe() 来解除引用关系，以避免内存泄露的发生。
         *
         */

        //实现Subscriber
        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                Log.i(TAG,"======complete");
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG,"======complete");
            }
        };
        return subscriber;
    }

    private Observable<String> initObservable(){

        //create() 方法是 RxJava 最基本的创造事件序列的方法。
        Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello World");
                subscriber.onNext("RxAndroid");
                subscriber.onCompleted();
            }
        });

        //just()方法 将传入的参数依次发送出来

        Observable observable2 = Observable.just("Hello World", "RxAndroid");
                // 将会依次调用：
                // onNext("Hello World");
                    // onNext("RxAndroid");
                // onCompleted();
        //from(T[]) / from(Iterable<? extends T>) : 将传入的数组或 Iterable 拆分成具体对象后，依次发送出来。
        String[] words = {"Hello World", "RxAndroid"};
        Observable observable3 = Observable.from(words);
        return observable;
    }


    /**
     * 订阅
     */
    private void subscribe(){
        initObservable().subscribe(initAction1(),initErrorAction(),initAction0());
        initObservable().subscribe(initSubcriber());
        initObservable().subscribe(initObserver());
    }

    //  除了 subscribe(Observer) 和 subscribe(Subscriber) ，subscribe() 还支持不完整定义的回调，
    //  RxJava 会自动根据定义创建出 Subscriber
    //  不完整定义就是将观察者的onNext、onError、onComplete方法以三个Action的方式单独定义；
    //  方式如下：

    private Action0 initAction0(){
        //
        Action0 onCompleteAction = new Action0() {
            @Override
            public void call() {
                Log.i(TAG,"===onCompleteAction");
            }
        };
        return onCompleteAction;
    }
    private Action1<String> initAction1(){
        //
        Action1<String> onNextAction = new Action1<String>() {
            // onNext()
            @Override
            public void call(String s) {
                Log.d(TAG, s);
            }
        };
        return onNextAction;
    }
    private Action1<Throwable> initErrorAction(){
        //
        Action1<Throwable> onErrorAction = new Action1<Throwable>() {
            // onError()
            @Override
            public void call(Throwable throwable) {
                // Error handling
            }
        };
        return onErrorAction;
    }



}
