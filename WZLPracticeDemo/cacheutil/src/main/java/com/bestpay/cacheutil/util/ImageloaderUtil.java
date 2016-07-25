package com.bestpay.cacheutil.util;

import android.content.Context;

import com.tgioihan.imageloader.ImageLoaderConfig;

/**
 * Created by wuzhenglei on 2016/7/22.
 */
public class ImageloaderUtil {

    public static ImageloaderUtil instance;

    public ImageloaderUtil getInstance(Context context){



        return null;
    }


    private void init(Context context){
        ImageLoaderConfig config = new ImageLoaderConfig.Builder(context).build();
    }
}
