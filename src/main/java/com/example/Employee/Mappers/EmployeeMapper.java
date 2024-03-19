package com.example.Employee.Mappers;

import org.springframework.stereotype.Component;

import com.example.Employee.Dtos.EmployeeDTO;
import com.example.Employee.Entities.Employee;

@Component
public class EmployeeMapper {
    public EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setEmail(employee.getEmail());
        dto.setLastName(employee.getLastName());
        return dto;
    }
    
    public Employee toEntity(EmployeeDTO dto) {
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setEmail(dto.getEmail());
        employee.setLastName(dto.getLastName());
        return employee;
    }
}
