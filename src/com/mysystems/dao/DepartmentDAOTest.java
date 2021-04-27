package com.mysystems.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Tuple;

import org.junit.jupiter.api.Test;

import com.mysystems.domain.Department;
import com.mysystems.domain.Employee;

;

class DepartmentDAOTest {

	@Test
	void testAddDepartment() {
		DepartmentDAO ddao = new DepartmentDAO();
		Department dpt = new Department();
		dpt.setDepartment_id(280);
		dpt.setDepartment_name("Games");
		dpt.setLocation_id(1700);
		dpt.setManager_id(205);
		ddao.addDepartment(dpt);
	}

	@Test
	void testAddDepartmentByJPA() {
		DepartmentDAO ddao = new DepartmentDAO();
		Department dpt = new Department();
		dpt.setDepartment_id(281);
		dpt.setDepartment_name("GamesJPA");
		dpt.setLocation_id(1700);
		dpt.setManager_id(205);
		ddao.addDepartmentByJPA(dpt);
	}

	// Todo test find , get and merge methods using JPA.
	@Test
	void testGetDepartmentsByCrit() {
		DepartmentDAO ddao = new DepartmentDAO();
		List<Department> ls = ddao.getDepartmentsByCrit();
		Iterator<Department> it = ls.iterator();

		while (it.hasNext()) {
			Department dpt = it.next();
			System.out.println(dpt.getDepartment_name() + " " + dpt.getLocation_id() + " " + dpt.getManager_id());
		}
		// assertEquals(203, ls.get(0).getManager_id());
	}

	@Test
	void testGetDepartmentsByCritGrpBy() {
		DepartmentDAO ddao = new DepartmentDAO();
		List<Tuple> ls = ddao.getDepartmentsByCritGrpBy();
		Iterator<Tuple> it = ls.iterator();

		while (it.hasNext()) {
			Tuple dpt = it.next();
			System.out.println(dpt.get(0));
			System.out.println(dpt.get(1));
		}
		// assertEquals(203, ls.get(0).getManager_id());
	}
	
	@Test
	void testGetDepartmentsByCritJoin() {
		DepartmentDAO ddao = new DepartmentDAO();
		List<Tuple> ls = ddao.getDepartmentsByCritJoin();
		Iterator<Tuple> it = ls.iterator();

		while (it.hasNext()) {
			Tuple dpt = it.next();
			System.out.print(dpt.get(0)+" ");
			System.out.print(dpt.get(1)+" ");
			System.out.print(((Employee)dpt.get(2)).getEmployee_id()+" ");
			System.out.print(((Employee)dpt.get(2)).getFirst_name()+" ");
			System.out.println(((Employee)dpt.get(2)).getLast_name()+" ");
			
		}
		// assertEquals(203, ls.get(0).getManager_id());
	}
	
	@Test
	void testGetDepttFromHQL() {
		DepartmentDAO ddao = new DepartmentDAO();
		List<Department> ls = ddao.getDepttFromHQL();
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object[] emp = (Object[]) it.next();
		System.out.println(emp[0]+" "+emp[1]);
		
		}	
	}
	
	
}
