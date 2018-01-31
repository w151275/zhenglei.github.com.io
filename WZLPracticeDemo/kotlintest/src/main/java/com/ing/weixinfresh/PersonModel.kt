package com.ing.weixinfresh

/**
 * Kotlin的属性 声明
 * Created by Ing. Wu on 2018/1/9.
 */

class PersonModel(var s :String) {

    //属性声明：var <propertyName>: <PropertyType> [= <property_initializer>]
//              [<getter>]
//              [<setter>]
//              getter和setter都是可选的
//    PropertyType 如果能通过结果推断出来 则可以省略
    private var sex :String = "男"

    private var age  :Int = 10

    private var name  = "Kotlin"


    fun getSex() :String{
        return this.sex;
    }

    object instance{ //object 修饰的表示单例

    }

    fun penDown(){}
    fun penUp(){}
    fun turn(degrees: Double){}
    fun forward(pixels: Double){}
}
