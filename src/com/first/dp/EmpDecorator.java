package com.first.dp;

import java.util.List;

import com.mysystems.domain.Certificate;
import com.mysystems.domain.Employee;

public class EmpDecorator {
	List<Certificate> lsCert;
	Employee e;
	
	EmpDecorator(Employee e){
		this.e = e;
	}
	
	List<Certificate> getCert(){
		return lsCert;
	}

	public Employee getEmp() {
		return e;
	}

	public void setEmp(Employee e) {
		this.e = e;
	}
	

}
