package com.example.jujukotlinprac

fun main(){
    //helloWorld()
    //println(add(4,5))

    //3. String Template
    /*
    val name = "juju"
    val lastName = "park"
    println("my name is ${name + lastName}I'm 29")

    println("is this true? ${1 == 0}")
    println("this is 2\$a")     // $ escape
    */

    checkNum(90)
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

    // 좌변의 type 생략 가능
    val c = 100
    var d = 100
    var name = "juju"

    // 초기화 없이 선언만 할 때는 type 명시
   var e : String
}

//4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

// when은 switch break문과 똑같다
fun checkNum(score : Int) {
    when(score) {
        0 -> println("This is 0")
        1 -> println("This is 1")
        2,3 -> println("This is 2 or 3")
        else -> println("I dont know")  // else 없어도 됨
    }

    var b = when(score){    // 변수에 대입할 때는 else 반드시 필요
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..90 -> println("not bad")
        else -> println("okay")
    }
}