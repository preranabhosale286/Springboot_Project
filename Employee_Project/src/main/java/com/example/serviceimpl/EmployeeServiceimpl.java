package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enitity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;


@Service
public abstract class EmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	public EmployeeRepository employeeRepository;

    
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	
	public Employee updateEmployee(Employee employee, int Eid) {
		// TODO Auto-generated method stub
		Employee emoloyee = employeeRepository.findById(Eid).get();
		employee.setName(employee.getName());
	    return employeeRepository.save(employee);
	}

	
	public String deleteEmployee(int Eid) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(Eid);
		return "the employee with id " + Eid + " has been deleted...";
	}

	
	public Employee saveEmployee1(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	
	public Employee findByEmployeeEId(int employeeEId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeEId).get();
	}
	


	
	
}
