package com.example.laboratorio3.entity;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
@RequestMapping("/employee")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @OneToMany
    @JoinColumn(name = "department_id")
    private List<Departments>;

}
