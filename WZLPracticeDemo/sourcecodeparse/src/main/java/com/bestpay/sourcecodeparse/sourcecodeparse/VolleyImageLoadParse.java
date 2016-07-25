package com.bestpay.sourcecodeparse.sourcecodeparse;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Volley加载图片的源码解析
 * Created by wuzhenglei on 2016/7/12.
 */
public class VolleyImageLoadParse {

    private RequestQueue queue;
    private void load(){
        queue.add(null);
    }

//    public RequestQueue(Cache cache, Network network) {
//        this(cache, network, DEFAULT_NETWORK_THREAD_POOL_SIZE);
//    }
//    public RequestQueue(Cache cache, Network network, int threadPoolSize) {
//        this(cache, network, threadPoolSize,
//                new ExecutorDelivery(new Handler(Looper.getMainLooper())));
//    }
//    public RequestQueue(Cache cache, Network network, int threadPoolSize,
//                        ResponseDelivery delivery) {
//        mCache = cache;
//        mNetwork = network;
//        mDispatchers = new NetworkDispatcher[threadPoolSize];
//        mDelivery = delivery;
//    }

    //Volley的requestQueue的构造方法

    //初始化主要就是4个参数：mCache、mNetwork、mDispatchers、mDelivery。
    // 第一个是硬盘缓存；
    // 第二个主要用于Http相关操作；
    // 第三个用于转发请求的；
    // 第四个参数用于把结果转发到UI线程（ps:你可以看到new Handler(Looper.getMainLooper())）。
    // 因此Volley请求并不需要担心子线程修改UI问题；
}
