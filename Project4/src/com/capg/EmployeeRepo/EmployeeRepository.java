package com.capg.EmployeeRepo;

import java.util.List;
import com.capge.beans.Employee;

public interface EmployeeRepository {
boolean  save(Employee e);
List<Employee> findByName(String name);
boolean findById(int EmpId);
}
