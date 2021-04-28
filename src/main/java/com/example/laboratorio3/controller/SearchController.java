package com.example.laboratorio3.controller;

import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller

public class SearchController {

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = {"","/"})
    public String indice(){
        return "Search/indice";
    }
    @GetMapping("/search/reporte0")
    public String emplo1(Model model){
        model.addAttribute("lista1",employeesRepository.EmployeesDescription());

        return "Search/reporte0";
    }


    @GetMapping("/search/reporte2")
    public String emplo2(Model model){
        model.addAttribute("lista1",employeesRepository.employrGerentes());

        return "Search/reporte2";
    }

    @GetMapping("/search/reporte1")
    public String emplo3(Model model){
        model.addAttribute("lista1",employeesRepository.employeCantidad());
        return "Search/reporte1";
    }

//COMPLETAR


}
