package com.capg.Service;

import java.util.List;

import com.capg.Excep1.EmployeeIdAlreadyExistException;
import com.capg.Excep1.EmployeeIdisNotValidException;
import com.capg.Excep1.InvalidEmployeeAddressException;
import com.capg.Excep1.InvalidEmployeeCountryAndCityNameException;
import com.capg.Excep1.NameNotFoundException;
import com.capge.beans.Address;
import com.capge.beans.Employee;

public interface EmployeeService {
  
	List<Employee> findByName(String name) throws NameNotFoundException;
	Employee createEmployee(String empName, Address address, int empId) throws NameNotFoundException, EmployeeIdAlreadyExistException, EmployeeIdisNotValidException, InvalidEmployeeAddressException, InvalidEmployeeCountryAndCityNameException;
	public boolean findById(int EmpId) throws EmployeeIdAlreadyExistException ;
  
}
