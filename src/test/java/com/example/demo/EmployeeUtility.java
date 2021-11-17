package com.example.demo;

import com.example.demo.Employee;

import java.util.Optional;

public class EmployeeUtility {

  public static Optional<Employee> getEmployee(){
    Optional<Employee> emp = Optional.empty();
     emp = Optional.of(new Employee(1, "R", "R", "R@R"));
    return emp;
  }
}
