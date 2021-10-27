package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAllEmployees(){
        List<Employee> employees = employeeRepo.findAll();
        return employees;
    }

    public Optional<Employee> findEmployeeById(Long id){

        Optional<Employee> employee = employeeRepo.findById(id);
        return employee;
    }

    public void deleteById(Long id){
        employeeRepo.deleteById(id);
    }

    public Employee updateEmployee(Employee employee){

     Employee updatedEmployee =    employeeRepo.save(employee);
        return updatedEmployee;
    }

    public Employee addEmployee(Employee employee){

       Employee newemployee = employeeRepo.save(employee);
       return newemployee;
    }

}
