package com.im.employee.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.im.employee.model.Employee;






@Repository

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{


}