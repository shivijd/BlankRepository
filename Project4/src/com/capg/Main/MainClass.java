package com.capg.Main;

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

public class MainClass {
	public static void main(String[] args) throws NameNotFoundException, EmployeeIdAlreadyExistException, EmployeeIdisNotValidException, InvalidEmployeeAddressException, InvalidEmployeeCountryAndCityNameException {
		 EmployeeRepository erp;
		 erp=new EmployeeRepositoryImplementation();
EmployeeService empSe=new EmployeeServiceImplementation(erp);
     City city=new City("City");
      city.setCityName("Delhi");
      Country country=new Country();
      country.setCity(city);
      country.setCountryName("INDIA");
      Address Address=new Address();
      Address.setAdressLine("103 KushiNagar");
     Address.setCountry(country);
     System.out.print(empSe.createEmployee("Shivi", Address, 1001));
      System.out.println(empSe.findByName("por"));
}
}
