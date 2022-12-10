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

//
/*
[Expression vs Statement]

Expression 은 뭔가를 return 하는 것.
Statement 는 return 하는게 없는 것.

코틀린의 모든 함수는 Expression 이다.
왜냐하면 코틀린의 함수는 최소 Unit 이라도 return 하니깐.

자바의 void func()는 Staement 이다.
*/

/*
5. Array and List
Array

List : Immutable List
       Mutable List
 */
fun array() {
    val array = arrayOf(1,2,3)
    val list  = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2  = listOf(1, "d", 3.4f)

    array[0] = 3
    //list[0] = 2   //immutable 이라서 원소 변경 불가능. interface 라서 get 은 가능 & set 불가능
    var result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
    
}