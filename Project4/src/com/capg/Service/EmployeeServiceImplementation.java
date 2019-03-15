package com.capg.Service;
import java.util.List;

import com.capg.EmployeeRepo.EmployeeRepository;
import com.capg.Excep1.EmployeeIdAlreadyExistException;
import com.capg.Excep1.EmployeeIdisNotValidException;
import com.capg.Excep1.InvalidEmployeeAddressException;
import com.capg.Excep1.InvalidEmployeeCountryAndCityNameException;
import com.capg.Excep1.NameNotFoundException;
import com.capge.beans.Address;
import com.capge.beans.Employee;


public class EmployeeServiceImplementation implements EmployeeService{
EmployeeRepository empRepo;
	public EmployeeServiceImplementation(EmployeeRepository empRepo) {
	super();
	this.empRepo = empRepo;
}
	@Override
	public List<Employee> findByName(String name) throws NameNotFoundException {
		if(empRepo.findByName(name).isEmpty())
			throw new NameNotFoundException();
		return empRepo.findByName(name);
	}
	
	
	@Override
	public Employee createEmployee(String empName, Address address, int empId) throws NameNotFoundException, EmployeeIdAlreadyExistException, EmployeeIdisNotValidException, InvalidEmployeeAddressException, InvalidEmployeeCountryAndCityNameException {
		if(empName==null)
			throw new NameNotFoundException();
		if(findById(empId))
			throw new EmployeeIdAlreadyExistException();
		if(empId<0)
			throw new EmployeeIdisNotValidException();
		if(address.getAdressLine()==" ")
			throw new InvalidEmployeeAddressException();
		if(address.getCountry()==null)
			throw new InvalidEmployeeAddressException();
		if(address.getCountry().getCity()==null)
			throw new InvalidEmployeeCountryAndCityNameException();
		Employee e=new Employee(empName, address, empId);
		
			if(empRepo.save(e))
				return e;
			return null;
		}
	
	public boolean findById(int EmpId) 
	{
		return empRepo.findById(EmpId);
	}
}
