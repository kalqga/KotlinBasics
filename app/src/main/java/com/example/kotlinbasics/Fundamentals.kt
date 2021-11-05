package com.example.kotlinbasics

fun main(){

    // val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
    // or
    // val numbers = intArrayOf(1,2,3,4,5,6)
    // or
    val numbers = arrayOf(1,2,3,4,5,6)

    println(numbers.contentToString())

    for(element in numbers){
        print(" ${element+2}")
    }

    for(element in numbers){
        print(" $element")
    }

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())

    for(index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }


    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size)
    println(months[1])

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("July")
    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    val removeList = mutableListOf<String>("Mon", "Wed")
    days.removeAll(removeList)
    // days.removeAt(3)
    println(days)

    // Sets and Maps

    val fruitz = setOf("Orange", "Apple", "Grape", "Apple")
    println(fruitz.toSortedSet())

    val newFruits = fruitz.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys){
        print("$key is to ${daysOfTheWeek[key]} ")
    }

    // Lambda Expression
    val sum = {a:Int, b:Int -> println(a+b)}
    sum(10,5)



}

data class Fruit(val name: String, val price: Double)