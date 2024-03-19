package org.example

import org.example.controllers.CustomersControllers
import org.example.controllers.EmployeesController
import org.example.controllers.IController
import org.example.model.Customer
import org.example.model.Employee
import org.example.model.Person

fun main() {

    val customer = Customer(
        "Luis",
        "Rosado",
        "Hernandez",
        99-83-56-81,
        "Playa del Carmen"
    )
    printPerson(customer)

    val employee = Employee(
        "Esau",
        "Rincon",
        "Martinez",
        99-83-55-76,
        "GHUILGDF",
        1500.00,
        "Repartidor"
    )

    printPerson(employee)

}

fun printPerson(person: Person) {
    println(person.printPersonType())
}