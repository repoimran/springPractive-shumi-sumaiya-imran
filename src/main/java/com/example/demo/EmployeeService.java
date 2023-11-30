package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepo;
	
	
	public List<Employee> getAllEmployees(){
		ArrayList<Employee> employees = new ArrayList<>();
		
		for(Employee employee: empRepo.findAll()) {
			employees.add(employee);
		}
		return employees;
	}

}
