package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
