package com.capg.EmployeeRepo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import com.capge.beans.Employee;

public class EmployeeRepositoryImplementation implements EmployeeRepository{

	Map<Integer, Employee> EmpMap = new HashMap<>();
	
	
	@Override
	public boolean save(Employee e) {
		
		if(EmpMap.containsKey(e.getEmpId())) {
			return false;
		}
		
		EmpMap.put(e.getEmpId(), e);
		return true;
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> list = new LinkedList<>();
		
		for(Entry<Integer, Employee> entry: EmpMap.entrySet()) {
			
			if(entry.getValue().getEmpName().equals(name)) {
				
				list.add(entry.getValue());
			}
		}
		return null;
	}
//@Override
//	public List<Employee> findByName(String name)
//	{
	
	
	
	
//	Set<Integer>list = EmpMap.keySet();
//	
//	Iterator<Integer> itr = list.iterator();
//	
//	while(itr.hasNext()) {
//		int n = itr.next();
//		if( itr.getClass().getName().equals(name))
//		System.out.println(n+" "+EmpMap.get(n));
//	}
//	return null;
//	}
	
	@Override
	public boolean findById(int EmpId) {
//		List<Employee> list = new LinkedList<>();
		
		for(Entry<Integer, Employee> entry: EmpMap.entrySet()) {
			
			if(entry.getValue().getEmpName().equals(EmpId)) {
				
				return true;
			}
		}
		return false;
	

	}
}
