package com.mysystems.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.mysystems.dao.EmployeeDAO;
import com.mysystems.domain.Employee;
import com.mysystems.services.HrService;

class EmployeeDAOTest {

	@Test
	void testAddEmployee() {
		EmployeeDAO eDao = new EmployeeDAO();
		Employee emp = new Employee();
		emp.setEmployee_id(4455);
		emp.setFirst_name("Fname");
		emp.setLast_name("Lname");
		emp.setEmail("email" +new Random().nextInt()+"@mail.com");
		emp.setJob_id("AD_VP");
		Calendar cal = Calendar.getInstance();
		cal.set(1981,03,04);
		emp.setHire_date(cal.getTime());
		eDao.addEmployee(emp);
	}
	
	@Test
	void testGetEmployeeJPAEM() {
		EntityManagerFactory emFactory = 
				Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		 em.getTransaction()
		        .begin();
		    Employee emp =em.find(Employee.class, 100L);
		    System.out.println(emp.getFirst_name());
		    em.getTransaction()
		        .commit();
		    em.close();
	}
	
	@Test
	void testGetEmployees() {
		
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> ls= eDAO.getEmployees();
		
		assertEquals(107,ls.size());
		assertEquals("Steven",ls.get(0).getFirst_name());
		assertEquals("King",ls.get(0).getLast_name());
		assertEquals(90,ls.get(0).getDepartment_id());
		assertEquals(24000,ls.get(0).getSalary());
		String str = ls.get(0).getHire_date().toString();
		assertEquals("1978-06-17",str);
		
	}
	
	@Test
	void testGetEmployeesHQL() {
		
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> ls= eDAO.getEmployeesHQL();
		
		assertEquals(110,ls.size());
		assertEquals("Steven",ls.get(0).getFirst_name());
		assertEquals("King",ls.get(0).getLast_name());
		//assertEquals(90,ls.get(0).getDepartment_id());
		assertEquals(24000,ls.get(0).getSalary());
		String str = ls.get(0).getHire_date().toString();
		assertEquals("1978-06-17",str);
		
	}
	
	@Test
	void testUpdateEmployee() {
		EmployeeDAO eDAO = new EmployeeDAO();
		int i= eDAO.updateEmployee();

		assertEquals(1,i);
			
	}
	@Test
	void testGetEmployeesHQLWithConditions() {
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> ls= eDAO.getEmployeesHQLWithConditions();
		Iterator<Employee> it = ls.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
		System.out.println(emp.getFirst_name()+" "+emp.getLast_name());
		}
		

			
	}
	
	@Test
	void testGetEmployeesHQLWithGrpBy() {
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> ls= eDAO.getEmployeesHQLWithGrpBy();
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object[] emp = (Object[]) it.next();
		System.out.println(emp[0]+" "+emp[1]);
	}
		
		
			
	}
	
	@Test
	void testGetEmployeesHQLFromDeptt() {
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> ls= eDAO.getEmployeesHQLFromDeptt();
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object[] emp = (Object[]) it.next();
		System.out.println(emp[0]+" "+emp[1]);
	}
	}
	
}
