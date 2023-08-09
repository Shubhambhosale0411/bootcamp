package com.telstra.restdemo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.restdemo.model.Employee;

@RestController
@RequestMapping("/api/vl")
public class EmployeeController {
	
	ArrayList<Employee>employees=new ArrayList<Employee>();
	public EmployeeController()
	{
		employees.add(new Employee(1,"sachin","hr",45000,23));
		employees.add(new Employee(2,"john","developer",65000,22));
		employees.add(new Employee(3,"sachin","hr",51000,25));
	}
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee)
	{
		employees.add(employee);
		return "element added sucessfully";
	}
	@GetMapping("/employee")
	public ArrayList<Employee> getAllEmployees()
	{
		return employees;
	}
	
	
}
