package com.example.laboratorio3.controller;

import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeesRepository employeesRepository;
    @GetMapping("/lista")
    public String listaEmployee(Model model){

       return "employee/lista";
    }
    /*

    public String nuevoEmployeeForm( ) {
        //COMPLETAR
    }


    public String guardarEmployee() {
        //COMPLETAR
    }


    public String editarEmployee() {
        //COMPLETAR
    }


    public String borrarEmpleado() {

       //COMPLETAR

    }

    //COMPLETAR

     */

}
