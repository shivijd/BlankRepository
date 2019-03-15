package com.capg.TestCases;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.capg.EmployeeRepo.EmployeeRepository;
import com.capg.EmployeeRepo.EmployeeRepositoryImplementation;
import com.capg.Excep1.EmployeeIdAlreadyExistException;
import com.capg.Excep1.EmployeeIdisNotValidException;
import com.capg.Excep1.InvalidEmployeeAddressException;
import com.capg.Excep1.InvalidEmployeeCountryAndCityNameException;
import com.capg.Excep1.NameNotFoundException;
import com.capg.Service.EmployeeService;
import com.capg.Service.EmployeeServiceImplementation;
import com.capge.beans.Address;
import com.capge.beans.City;
import com.capge.beans.Country;


public class TestCasesC {
	EmployeeService ems;
	@Before
	public void setUp() throws Exception {
		EmployeeRepository erp=new EmployeeRepositoryImplementation();
		ems=new EmployeeServiceImplementation(erp);
	}
	@Test(expected=com.capg.Excep1.NameNotFoundException.class)
	public void whenNameOfEmployeeIsNullCreateException() throws NameNotFoundException, EmployeeIdAlreadyExistException, EmployeeIdisNotValidException, InvalidEmployeeAddressException, InvalidEmployeeCountryAndCityNameException
	{
		Address add= new Address("kjhjkh",new Country("kghjkg",new City("jhgh")));
		ems.createEmployee(null, add, 1);
	}
	@Test
	public void whenNameOfEmployeeIsPresentEmployeeSearchedSuccessfully()throws NameNotFoundException, EmployeeIdAlreadyExistException, EmployeeIdisNotValidException, InvalidEmployeeAddressException, InvalidEmployeeCountryAndCityNameException
	{

		ems.createEmployee("shivi", new Address() , 1928);
	}

}
