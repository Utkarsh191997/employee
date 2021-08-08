package com.im.employee.controller;

import com.im.employee.Service.EmployeeService;
import com.im.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    private List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    private Employee getAllEmployee(@PathVariable("id") int id)
    {
        return employeeService.getEmployeeById(id);
    }


    @DeleteMapping("/employee/{id}")
    private void deleteEmployee(@PathVariable("Number") int Number)
    {
        employeeService.delete(Number);
    }
    //creating post mapping that post the student detail in the database

    @RequestMapping(value ="/saveEmployee",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    private int saveEmployee(@RequestBody Employee employee)
    {
        System.out.println(employee.toString());
        employeeService.saveOrUpdate(employee);
        return employee.getId();
    }




    @GetMapping("/test")
    private String test()
    {
        return "in Employee Test Application";
    }
}
