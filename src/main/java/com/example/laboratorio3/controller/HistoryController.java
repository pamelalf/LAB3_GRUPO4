package com.example.laboratorio3.controller;


import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class HistoryController {
    @Autowired
    EmployeesRepository employeesRepository;
    @GetMapping("/result")
    public String resultado(@RequestParam("word") String word , Model model){
        model.addAttribute("lista",employeesRepository.EmployeesDescription2());

        return "index";
    }



}
