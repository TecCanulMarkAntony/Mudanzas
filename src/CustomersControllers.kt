package org.example.controllers

import org.example.model.Customer
import org.example.utils.Printer

class CustomersControllers(val printer: Printer) : IController {

    private val customerList = mutableListOf<Customer>()


    override fun registerModel() {


        printer.apply {
            printMsg("Ingrese el nombre/nombres")
            val customerNames = readln()
            printMsg("Ingrese el primer apellido")
            val customerFirstLastName = readln()
            printMsg("Ingrese el segundo apellido")
            val secondLastName = readln()
            printMsg("Ingrese el número celular")
            val phoneNumber = readln().toLong()
            printMsg("Ingrese la dirección")
            val address = readln()

            val customer = Customer(
                customerNames,
                customerFirstLastName,
                secondLastName,
                phoneNumber, address
            )

            customerList.add(customer)
        }
    }

    override fun showAllModels() {
    }
}