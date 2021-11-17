package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeControllerTest {

  @Autowired
  EmployeeService employeeService;
  @MockBean
  EmployeeRepo employeeRepo;





  List<Employee> listofEmployees = Arrays.asList(
    new Employee(1,"Rish1","Th1","RIS1@gmail.com"),
    new Employee(1,"Rish2","Th2","RIS2@gmail.com")
  );



  @Test
  public void findAllEmployeesTest(){
    List allEmployees =employeeRepo.findAll();
    when(employeeRepo.findAll())
      .thenReturn(listofEmployees);

    List<Employee> result = employeeService.findAllEmployees();
    assertEquals(result,listofEmployees);
  }

  @Test
  public void findEmployeeByIdTest(){
    Optional<Employee> expected = EmployeeUtility.getEmployee();

    when(employeeRepo.findById(1L))
      .thenReturn(expected);

    Optional<Employee> result = employeeService.findEmployeeById(1L);
    assertEquals(expected,result);


  }

}
