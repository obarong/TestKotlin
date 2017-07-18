package com.example

/**
 * Created by LJR on 2017/7/6 0006.
 */

class Function

fun main(args: Array<String>){
    val a: Int = 1
    val b: Int = 2
    println("a = " + a)
    println("b = " + b)
    println("a + b = " + (a + b))
    println("a + b = " + sum(a, b))

    //测试Kotlin调用Java
    TestJava.main(null)

    //test var
    testvar();

    testtemplate();
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun testvar(){
    var x = 5
    x += 1
    println("x = $x")
}

fun testtemplate() {
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}
