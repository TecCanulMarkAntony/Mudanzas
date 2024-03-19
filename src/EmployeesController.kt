package org.example.controllers

import org.example.model.Employee

class EmployeesController : IController {

    override fun registerModel() {


        val addedEmployee = Employee(
            "Roberto",
            "Silva",
            "Avila",
            9985435423,
            "FGTERGDFSSAF78",
            1800.00,
            "VENDEDOR"
        )
    }

    override fun showAllModels() {
        TODO("Not yet implemented")
    }

}