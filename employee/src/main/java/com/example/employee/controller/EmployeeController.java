package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepository;
	
	//@RequestMapping(value="/employees", method=RequestMethod.GET)
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empRepository.findAll();
	}
	@PostMapping("/employees")
	public Employee createEmployee(@Validated @RequestBody Employee emp) {
		return empRepository.save(emp);
	}
}
