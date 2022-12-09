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