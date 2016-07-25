package com.bestpay.designmode.interfacee;

import com.bestpay.designmode.mode.OneProduct;
import com.bestpay.designmode.mode.TwoProduct;

/**
 * Created by wuzhenglei on 2016/7/7.
 */
public interface IFactory {

     OneProduct createProduct();

    TwoProduct createProduct(String type);
}
