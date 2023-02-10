package com.example.enitity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {
	private int Eid;
	private String Name;
	private int Salary;
	private String Desg;
	private String Dept;
	private String Email;
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDesg() {
		return Desg;
	}
	public void setDesg(String desg) {
		Desg = desg;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Employee(int eid, String name, int salary, String desg, String dept, String email) {
		super();
		Eid = eid;
		Name = name;
		Salary = salary;
		Desg = desg;
		Dept = dept;
		Email = email;
	}
	
}
