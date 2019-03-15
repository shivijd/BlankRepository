package com.capge.beans;

public class Employee {
private String EmpName;
private Address address;
private int EmpId;
@Override
public String toString() {
	return "Employee [EmpName=" + EmpName + ", address=" + address + ", EmpId=" + EmpId + "]";
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public Employee(String empName, Address address, int empId) {
	super();
	this.EmpName = empName;
	this.address = address;
	this.EmpId = empId;
}

}
