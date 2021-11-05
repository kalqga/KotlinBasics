package com.example.kotlinbasics

data class User(val id: Long, val name: String)

fun main(){
    var patar = Person("Patar", "Diya", 30)
    patar.hobby = "Fifa"
    patar.stateHobby()
    var myCar = Carr()
    println(myCar.myModel)
    val user1 = User(1, "Patar")
    val name = user1.name
    println(name)

}

class Person(firstName: String, lastName: String){

    // Member Variables -> Properties
    var age: Int? = null
    var hobby: String = "watch Netflix"

    // Initializer Block
    init {
        println("Person created called $firstName $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
        this.age = age
    }

    // Member functions -> Methods
    fun stateHobby(){
        println("My hobby is $hobby")
    }

}

class Carr(){
    lateinit var  owner : String

    val myBrand : String = "BMW"
        // Custom getter
    get() {
        return field.lowercase()
    }
    var maxSpeed : Int = 250

    // Can only change myModel in init method
    var myModel : String = "M5"
        private set


    init {
        this.owner = "Patar"
    }
}
