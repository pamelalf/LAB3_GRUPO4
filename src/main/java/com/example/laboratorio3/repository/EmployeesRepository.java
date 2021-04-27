package com.example.laboratorio3.repository;


import com.example.laboratorio3.dto.EmployeeDescription;
import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
    @Query(value = "select e.employee_id,e.first_name, e.last_name,j.job_title,d.department_name,l.city from employees e\n" +
            "inner join jobs j on e.job_id =j.job_id\n" +
            "inner join departments d on e.department_id=d.department_id\n" +
            "inner join locations l on l.location_id = d.location_id", nativeQuery = true)
    List<EmployeeDescription> EmployeesDescription();

}
