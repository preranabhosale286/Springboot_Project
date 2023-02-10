package com.example.service;

import java.util.List;

import com.example.enitity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
    
	Employee findByEmployeeId(int Eid);
    
    List<Employee> getAllEmployee();

	String deleteEmployee(int Eid);
	
	Employee updateStudent(Employee employee, int Eid);
}
