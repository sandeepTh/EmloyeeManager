package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> findAllEmployees(){
        List<Employee> list = employeeService.findAllEmployees();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/find/{Id}")
    public ResponseEntity<Optional<Employee>> findEmployeeByID(@PathVariable Long Id){
        Optional<Employee> newEmployee = employeeService.findEmployeeById(Id);
        return new ResponseEntity<Optional<Employee>>(newEmployee,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity deleteEmployeeById(@PathVariable Long Id){
        employeeService.deleteById(Id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> update(@RequestBody Employee employee){
       // ResponseEntity<Optional<Employee>> employee1 = findEmployeeByID(id);
        Employee employee1 =employeeService.updateEmployee(employee);
        return new ResponseEntity<Employee>(employee1,HttpStatus.OK);
    }

}
