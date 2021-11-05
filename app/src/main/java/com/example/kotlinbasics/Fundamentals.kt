package com.example.kotlinbasics

fun main(){

    // val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
    // or
    // val numbers = intArrayOf(1,2,3,4,5,6)
    // or
    val numbers = arrayOf(1,2,3,4,5,6)

    println(numbers.contentToString())

    for(element in numbers){
        print(element)
    }


}