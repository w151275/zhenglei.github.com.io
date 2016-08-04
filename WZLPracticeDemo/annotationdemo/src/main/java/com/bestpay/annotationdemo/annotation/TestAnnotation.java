package com.bestpay.annotationdemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wuzhenglei on 2016/7/27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {


     String name() default "wu";

     enum Sex{
          male,
          female;
     }

     Sex sex() default Sex.male;
}
