package com.example.kotlinbasics

fun main(){

//    var first: String = "Android Masterclass"
//    val second: Float = 13.37F
//    val third: Double = 3.14159265358979
//    var fourth: Byte = 25
//    var fifth: Short = 2020
//    var sixth: Long = 18881234567
//    var seventh: Boolean = true
//    var eighth: Char = 'a'

//    for (i in 0..10000){
//        if (i == 9001){
//            println("IT'S OVER 9000!!!")
//        }
//    }
//
//    var humidityLevel = 80
//    var humidity = "humid"
//
//    while (humidity == "humid"){
//        humidityLevel -= 5
//        println("humidity decreased")
//        if (humidityLevel < 60){
//            humidity = "comfy"
//            println("it's comfy now")
//        }
//    }

    var first = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    var second = MobilePhone("Android", "Xiaomi", "MI 12")
    var third = MobilePhone("IOS", "iPhone", "13 Pro")
    first.chargeBattery(30)

}

class MobilePhone(osName: String, brand: String, model: String){
    private var battery: Int = 40
    init {
        println("$osName $brand $model")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy}")
        battery += chargedBy
    }
}