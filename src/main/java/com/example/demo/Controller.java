package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
//
@RestController
//@RequestMapping("/qaenv")
//@RequestMapping("/bangladesh")
public class Controller {
	@Autowired
	EmployeeService empServ;
	
	
	@GetMapping("/hello")
	public String greetings() {
		return "hello welcome";
	}
	
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmp(){
		System.out.println("from controller");
		return empServ.getAllEmployees();
	}
	
	
	

}
