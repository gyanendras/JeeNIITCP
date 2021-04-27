package com.first.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mysystems.domain.Employee;

class PrinterObjectTest {

	@Test
	void testPrint() {
		Employee emp = new Employee();
		EmpPrintAdapter e = new EmpPrintAdapter();
		PrinterObject.print(e.adaptEmp(emp));
		//***      ***
		// PrinterObject.print(s);
		
		// Adapter example from java
		List l = new ArrayList();
		Collections.sort(l);
		Arrays.sort(l.toArray());
	}
	
	
	
	

}
