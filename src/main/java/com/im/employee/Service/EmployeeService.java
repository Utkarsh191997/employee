package com.im.employee.Service;

import com.im.employee.Repository.EmployeeRepository;
import com.im.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;
    //getting all Employee records
    public List<Employee> getAllEmployee()
    {
        List<Employee> employees = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(Employee -> employees.add(Employee));
        return employees;
    }
    //getting a specific record
    public Employee getEmployeeById(int id)
    {
        return employeeRepository.findById(id).get();
    }
    public void saveOrUpdate(Employee Employee)
    {
        employeeRepository.save(Employee);
    }
    //deleting a specific record
    public void delete(int id)
    {
        employeeRepository.deleteById(id);
    }
}
