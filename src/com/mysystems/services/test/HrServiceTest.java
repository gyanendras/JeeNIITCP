package com.mysystems.services.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import com.mysystems.dao.EmployeeDAO;
import com.mysystems.domain.Employee;
import com.mysystems.services.HrService;


class HrServiceTest {

	

	@Test
	void testGetDepartments() {
		fail("Not yet implemented");
	}
	
	@Test
	void testPrintNameSalAndDate() {
		HrService hrs = new HrService();
		hrs.printNameSalAndDate();
	}
	
	@Test
	void testPrintNameSalDeptDate() {
		HrService hrs = new HrService();
		hrs.printNameSalDeptDate();
	}
		
	

}
