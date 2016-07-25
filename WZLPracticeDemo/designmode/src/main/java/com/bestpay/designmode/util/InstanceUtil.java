package com.bestpay.designmode.util;

/**
 * 单例模式的实现类
 * Created by wuzhenglei on 2016/7/7.
 */
public class InstanceUtil {

    private static InstanceUtil instance1;
    private static InstanceUtil instance2;
    private static InstanceUtil instance3;
    private static InstanceUtil instance4;


    /**
     * 恶汉式单例模式
     * @return
     */
    public static InstanceUtil getInstance1(){
        if(instance1 == null){
            instance1 = new InstanceUtil();
        }
        return instance1;
    }

    /**
     * 解决了线程安全问题，
     * 但是每个线程调用getInstance都要加锁，
     * 我们想要
     * 加同步锁
     * @return
     */
    public static synchronized  InstanceUtil getInstance2(){
        if(instance2 == null){
            instance2 = new InstanceUtil();
        }
        return null;
    }

    /**
     * 只在第一次调用getInstance时加锁，双重检测方案
     * @return
     */
    public static InstanceUtil getInstance3(){
        if(instance3 == null){
            synchronized(InstanceUtil.class) {
                InstanceUtil temp = instance3;
                if(temp == null) {
                    temp = new InstanceUtil();
                    instance3 = temp;
                }
            }
        }
        return instance3;
    }



    /**
     * 由于指令重排序问题，所以不可以直接写成下面这样：
     * 但是在变量前面加上volatile修饰词就不用考虑指令重排序问题
     */

        public static InstanceUtil getInstance4() {
            if(instance4 == null) {
                synchronized(InstanceUtil.class) {
                    if(instance4 == null) {
                        instance4 = new InstanceUtil();
                    }
                }
            }

            return instance4;
        }


    private static class classHolder{
        private final static InstanceUtil INSTANCE = new InstanceUtil();
    }

    /**
     * 内部类形式，线程安全
     * @return
     */
    public static InstanceUtil getInstance5(){
        return classHolder.INSTANCE;
    }

}


