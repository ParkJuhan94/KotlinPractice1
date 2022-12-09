package com.example.jujukotlinprac

fun main(){
    helloWorld()

    println(add(4,5))
}

//1. 함수

// return void 일 땐, Unit : 생략 가능
fun helloWorld() : Unit {
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
fun hi() {
    val a : Int = 10

    var b : Int = 9

    //  a = 100     -> val은 변경 불가
    b = 100         // var은 변경 가능

    val c = 100     // 좌변의 Int 생략 가능
    var d = 100     // 좌변의 Int 생략 가능
}