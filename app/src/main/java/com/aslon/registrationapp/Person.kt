package com.aslon.registrationapp

data class Person(
    var userName:String,
    var age: Int,
    var gender:String,
    var password:String,
    var repeatPassword:String

)
enum class Gender(val uzb: String){
    MALE("Erkak"),
    FEMALE("Ayol")
}

