package com.first.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import com.mysystems.domain.Employee;

class EmpDecoratorTest {

	

	@Test
	void testEmpDeco() throws FileNotFoundException {
		Employee tom = new Employee();
		EmpDecorator e = new EmpDecorator(tom);
		e.getCert();
		
		// Decorator in Java
		InputStream is = new FileInputStream("myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(is);
	}

}
