package com.example.laboratorio3.repository;


import com.example.laboratorio3.dto.EmployeeDescription;
import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
    @Query(value = "select e.first_name, e.last_name,jh.start_date , jh.end_date ,j.job_title from employees e\n" +
            "inner join jobs j on e.job_id =j.job_id\n" +
            "inner join job_history jh on jh.employee_id=e.employee_id\n" +
            "where e.salary >15000;", nativeQuery = true)
    List<EmployeeDescription> EmployeesDescription();

    @Query(value = "select d.department_name, e.first_name, e.last_name,e.salary from employees e\n" +
            "inner join departments d on d.department_id = e.department_id\n" +
            "inner join jobs j on j.job_id =e.job_id where j.job_title like \"% Manager\";", nativeQuery = true)
    List<EmployeeDescription> employrGerentes();

    @Query(value = "select c.country_name, l.city ,count(e.department_id) as cant from locations l  \n" +
            "inner join  countries c  on l.country_id=c.country_id\n" +
            "inner join departments d on d.location_id=l.location_id\n" +
            "inner join employees e on e.department_id=d.department_id\n" +
            "group by e.department_id ;",nativeQuery = true)
    List<EmployeeDescription> employeCantidad();

    @Query(value = "select e.first_name, e.last_name,d.department_name ,j.job_title ,jh.start_date  from employees e\n" +
            "inner join jobs j on e.job_id =j.job_id\n" +
            "inner join job_history jh on jh.employee_id=e.employee_id\n" +
            "inner join departments d on d.department_id=e.department_id\n" +
            "where e.first_name like %?1% or e.last_name like %?1% or e.department_name like %?1% or j.job_title like %?1%" +
            ";", nativeQuery = true)
    List<EmployeeDescription> EmployeesDescription2();




}
