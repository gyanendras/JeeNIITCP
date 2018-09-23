package com.mysystems.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mysystems.dao.DepartmentDAO;
import com.mysystems.dao.EmployeeDAO;
import com.mysystems.domain.Department;
import com.mysystems.domain.Employee;

public class HrService {

	public void printNameSalAndDate() {
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> lst = eDAO.getEmployees();
		Collections.sort(lst, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int nameComp = o1.getFirst_name().compareTo(o2.getFirst_name());
				int dateComp = o1.getHire_date().compareTo(o2.getHire_date());
				if (o1.getHire_date().equals(o2.getHire_date())) {
					return nameComp;
				} else {
					return dateComp;
				}

			}
		});

		for (Employee emp : lst) {
			System.out.println(emp.getFirst_name() + " " + emp.getSalary() + " " + emp.getHire_date());
		}
	}

	public void printNameSalDeptDate() {
		EmployeeDAO eDAO = new EmployeeDAO();
		List<Employee> lst = eDAO.getEmployees();

		Collections.sort(lst, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getFirst_name().compareTo(o2.getFirst_name());
			}

		});
		DepartmentDAO dDAO = new DepartmentDAO();
		List<Department> deptList = dDAO.getDepartments();
		for (Employee emp : lst) {
			Department dId= dDAO.getDepartmentById((int)emp.getDepartment_id(), deptList);
			if(dId==null) {
			System.out.println(emp.getFirst_name() + " " + emp.getLast_name() + " "
					+ "NULL" + " "
					+ "NULL" + " "
					+ emp.getSalary() + " " + emp.getHire_date());
			}else {
				System.out.println(emp.getFirst_name() + " " + emp.getLast_name() + " "
						+ dId.getDepartment_id() + " "
						+ dId.getDepartment_name() + " "
						+ emp.getSalary() + " " + emp.getHire_date());
			}
		}
	}

}
