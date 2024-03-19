package com.example.Employee.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.Employee.Entities.Employee;
import com.example.Employee.Repository.EmployeeRepository;

@Service
// @CacheConfig(cacheNames = "employees")
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    // @Cacheable
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    // @Cacheable(key = "#id")
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
