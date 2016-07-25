package com.bestpay.designmode;

import android.app.Activity;
import android.os.Bundle;

import com.bestpay.designmode.util.ProductFactory;
import com.bestpay.designmode.mode.OneProduct;
import com.bestpay.designmode.mode.TwoProduct;

/**
 * 代工厂模式
 *
 * 1、静态工厂模式   :项目中的辅助类，TextUtil.isEmpty等，类+静态方法.
 * 2、简单工厂模式
 *    描述：1.首先创建各种实体类，在实体类中实现各种方法功能(相当于产品)；
 *          2.创建一个工具类，实现根据不同类型创建不同实体类的实例(相当于工厂生产产品)
 *          3.通过引用这个工具类来实现不同功能；
 * 3、工厂方法模式
 *    描述： 1.定义一个抽象类，里面定义个抽象的方法(抽象的工厂)
 *          2.定义工厂类，根据不同的类型生成不同的工厂；
 *          3.根据工厂类，定义不同产品；
 * 4、抽象工厂模式
 *    描述: 1.定义一个抽象的工厂，里面定义各种抽象方法对应不同的产品
 *          2.重写方法，实例化特定的产品；
 *
 * Created by wuzhenglei on 2016/7/7.
 */
public class FactoryActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OneProduct one1 = new OneProduct();
        TwoProduct two = new TwoProduct();
        one1.print();
        two.print();
        //简单代工厂模式
        OneProduct one = (OneProduct) ProductFactory.createProduct("01");
        one.action();
    }
}
