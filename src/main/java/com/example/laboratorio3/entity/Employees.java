package com.example.laboratorio3.entity;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@RequestMapping("/employee")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String first_name;
    private String last_name;
    @OneToMany
    @JoinColumn(name = "job_id")
    private Job job;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments departments;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private String city;


}
