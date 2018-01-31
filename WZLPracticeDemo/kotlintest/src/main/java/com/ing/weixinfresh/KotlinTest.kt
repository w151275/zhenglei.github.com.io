package com.ing.weixinfresh

import android.app.Activity
import android.os.Bundle
import android.util.Log

/**
 *
 * Kotlin 常见的语法格式
 * Created by Ing. Wu on 2018/1/19.
 */
class KotlinTest : Activity(){



    var args :ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState :Bundle?) {
        super.onCreate(savedInstanceState)
        getResult()
        args.add("12");
        forwhile(args)
        useRange(100)
        var personModel = PersonModel.instance
//        println(personModel.getSex())
//        BasicType()
        filterList()
        ustMapOrList()
        useWenhao()
    }

    var a :Int = 0
    var view : PersonModel?= null
    private fun sum(a:Int ,b :Int): Int{
        return a + b
    }

//  普通方法体
    private fun getResult(){
        var a  = 1
        var b  = 2
        Log.i("","I am kotlin${sum(a,b)}")
    }
//  结果允许为空
    private fun getResultCheckNotNull(a:Int ,b: Int):Int?{
        var c:Float
        c  = (a + b).toFloat()
        c is Float
        return null;
    }

//    for 循环
    private fun forwhile(args :ArrayList<String>){
        for(a in args){
            println("I am args ${a}");
        }

        for(i in args.indices){
            println("I am args ${args[i]}");
        }
    }
//    when 关键字 类似 switch

    private fun usewhen(obj :Any){
        when(obj){
            is Int  -> print("I am Int ")
            is String -> print("I am String")
            else -> print("I am Unkown")
        }
    }

//    range 范围用法
    private fun useRange(y :Int ){
//        for(a in 1..y-1){
//            print("Range of 1 to y-1")
//        }
//
//        for(a in 1..100){
//            print("Range of 1 to 100 desc: [1,100]")
//        }
//
//        for(a in 1 until 100){
//            print("Range of 1 to 100 desc: [1,100)")
//        }

        for(a in 1..20 step 3){
            println("Range of 1 to 100 step 3 差为3的等差数列${a}")
        }

        if(2 in 1..20){
            println("2 is it between 1 and 20")
        }
    }

    //数据基本类型
    fun BasicType(){
        var byteA :Byte = 2
        var a :Int = byteA.toInt()
        var byteB :Byte = a.toByte()
        var b = a
        var c = a
        println(b === c)
        println(b == c)
        var d :Int ?= a
        var e :Int ?= a
        println(d === e)
        println(d == e)

    }

    //过滤list
    fun filterList(){
        var list :ArrayList<Int> = ArrayList()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(-1)
        list.add(4)
        list.add(0)
        var listdata  = list.filter {
            x -> x > 0
        }
        println("Filter list ==="+listdata)
        println("Filter list size ==${listdata.size}")
    }

    //访问map
    fun ustMapOrList(){
        val list = listOf("a", "b", "c")
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        for((a,b) in map){//map遍历
            println("this map: ${a} -> ${b}")
            println("key ${a} value is ${map[a]}") //map的根据key获取value
        }
    }

    //? 修饰符的使用
    fun useWenhao(){
        var list = listOf<String >("a","b","c","d","e")
        var listB :List<String> ?= null
        println(list?.size) //表示当list不为空的时候去执行list.size
        println(listB ?:"list is Empty")
        println(list?.last {
            x -> x.equals("c")
        })
    }

    //with方法的使用
    fun useWith(personModel: PersonModel){
        //常规写法：
        personModel.turn(23.3)
        personModel.penDown()
        //用with方法的写法
        with(personModel){
            penDown()
            turn(23.3)
        }
    }


}