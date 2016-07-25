package com.bestpay.designmode.util;

import com.bestpay.designmode.mode.OneProduct;
import com.bestpay.designmode.mode.Product;
import com.bestpay.designmode.mode.TwoProduct;

/**
 * 产品工厂
 * Created by wuzhenglei on 2016/7/7.
 */
public class ProductFactory<T extends Product> {

    public static Product createProduct(String type){
        Product product = null ;
        if("01".equals(type)){
            product = new OneProduct();
            return product;
        }else if("02".equals(type)){
            product = new TwoProduct();
            return product;
        }
        return null;
    }
}
