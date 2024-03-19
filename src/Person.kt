package org.example.model

abstract class Person(
    val names: String,
    val firstLastName: String,
    val secondLastName: String,
    val phoneNumber: Number
) {

    fun getFullName(): String {
        println("Retornando el nombre completo")
        return "$names $firstLastName $secondLastName"
    }

    abstract fun printPersonType()

}