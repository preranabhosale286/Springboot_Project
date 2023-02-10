package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.enitity.Employee;
import com.example.service.EmployeeService;


@RestController

public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	
	
	// add a employee
	
	@PostMapping(value = "/employee")
	public Employee addController(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

    // get all employee
	
	@GetMapping(value = "/employee")
	public List<Employee> getAllController() {
		return employeeService.getAllEmployee();
	}

	// update a employee 
	@PutMapping(value = "/employee/{id}")
	public Employee updateController(@PathVariable int Eid, @RequestBody Employee student) {
		return employeeService.updateStudent(student, Eid);
	}

	// delete a employee

	@DeleteMapping(value = "/employee/{id}")
	public String deleteController(@PathVariable int Eid) {
		return employeeService.deleteEmployee(Eid);
	}

	
	 
}

