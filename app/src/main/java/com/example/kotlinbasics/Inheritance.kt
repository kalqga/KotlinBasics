package com.example.kotlinbasics


// Parent Class, Super Class, Base Class
//open class Vehicle{
//
//}


interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Sub Class of Vehicle, Child Class, Derived Class
// Parent Class, Super Class, Base Class OF VEHICLE
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0){
            range += amount
        }
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }

    fun drive(distance: Double){
        println("Drove for $distance km")
    }
}

// Sub Class of Vehicle, Child Class, Derived Class
class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(250.0, name, brand){

}

fun main(){
    var audi = Car(180.0, "A3", "Audi")
    var tesla = ElectricCar("S-Model", "Tesla", 85.0)

    audi.drive(200.0)
    tesla.drive(200.0)

}
