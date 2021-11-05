package com.example.kotlinbasics

fun main(){

    // immutable variable
    // TODO: Add new functionality

    /*
    This
    is a multiline
    comment
     */

    // var -> can assign new value to it
    // val -> new value can't be assigned

    // string
    val myName = "Patardiya"
    // int
    var myAge = 31

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120_3

    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    var isSunny: Boolean = true

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharacterInStr = myStr[myStr.length - 1]
    var myLength = myStr.length


    // print("First character: $firstCharInStr and the length of myStr is ${myStr.length}")

    // Arithmetic operator (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble: Double = a / b
    // print(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==5

    // Assignment operator (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4

    // println("myNum is $myNum")

    // Increment & Decrement operators (++, --)

    myNum++
    // println("myNum is $myNum")
    // println("myNum is ${myNum++}")
    // println("myNum is ${++myNum}")

    /*
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("Use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("Use your power technique 1337")
    }else{
        println("Use technique")
    }

    val age = 17
    if(age >= 21){
        println("now you may drink in the US")
    }else if(age >= 18){
        println("you may vote now")
    }else if(age >= 16){
        println("you may drive now")
    }else{
        println("you're too young")
    }

    var name = "Patar"

    if(name == "Patar"){
        println("Welcome home Patar")
    }else{
        println("Who are you?")
    }

    var isRainy = true
    if(isRainy){
        println("It's rainy")
    }

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

     */

    // While Loop
    var x = 1
    /*
    while(x <= 10){
        println("$x")
        x++
    }

     */

    // Do While Loop (if condition of while is not met it runs once)

    do{
        print("$x")
        x++
    }while(x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if (roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    // For Loop

    for (num in 1..10){
        print("$num")
    }
    for (i in 1 until 10){
        print("$i ")
    }
    for (i in 10 downTo 1){
        print("$i ")
    }
    for (i in 10 downTo 1 step 2){
        print("$i ")
    }

    // Functions

    myFunction()
    println(addUp(5, 3))
    println(avg(5.0,13.0))

    // Nullables

    // var name: String = "Patar"
    // name = null -> Compilation ERROR
    var nullableName: String? = "Patar"
    nullableName = null

    //var len = name.length
    var len2 = nullableName?.length
    // nullableName?.let { println(it.length) }

//    if(nullableName != null){
//        var len2 = nullableName.length
//    }else{
//        null
//    }
    // Elvis Operator
    val name = nullableName ?: "Guest"
    println(name)

    // nullableName!!.toLowerCase()
    // val wifesAge: String? = user?.wife?.age ?: 0

}

fun avg(a: Double, b: Double): Double{
    return (a+b)/2
}

fun addUp(a: Int, b: Int) : Int{
    return a + b
}

fun myFunction(){
    println("Called from myFunction")
}
