package com.mysystems.domain;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	@Column(name = "department_id")
	int department_id ;
	
	@Column(name = "department_name")
	String department_name;
	
	@Column(name = "manager_id")
	Integer manager_id;
	
	@Column(name = "location_id")
	Integer location_id;
	
	@OneToMany
	@JoinColumn(name = "department_id")
	List<Employee> employees;
    
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
    
    

}
