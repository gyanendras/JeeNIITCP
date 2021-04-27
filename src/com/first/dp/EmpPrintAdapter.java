package com.first.dp;

import com.mysystems.domain.Employee;

public class EmpPrintAdapter {
	String adaptEmp(Employee e){
		String s = e.getFirst_name() + e.getLast_name();
	    return s;
	}
	
	

}
