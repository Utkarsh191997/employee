package com.im.employee.controller;

import com.im.employee.Service.EmployeeService;
import com.im.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeJspController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/addEmployee")
    public String sendForm(Employee employee) {
        System.out.println("employee data string" + employee.toString());
        employeeService.saveOrUpdate(employee);
        return "thankYou";

    }

    @GetMapping("/addEmployeeData")
    public String addEmployeeData() {
        return "addEmployee";

    }
}



