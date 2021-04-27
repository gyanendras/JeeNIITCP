package com.mysystems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysystems.domain.Department;
import com.mysystems.domain.Employee;

public class EmployeeDAO {
	
	public List<Employee> getEmployees() {
		Connection con = MYSQLConnection.getConnection();
		String query = "Select * from Employees";
		
		List<Employee> empList = new ArrayList<Employee>();

		try (Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployee_id(rs.getLong(1));
				emp.setFirst_name(rs.getString(2));
				emp.setLast_name(rs.getString(3));
				emp.setDepartment_id(rs.getLong(11));
				emp.setSalary(rs.getDouble(8));
				emp.setHire_date(rs.getDate(6));
				empList.add(emp);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;

	}
	
	public void addEmployee(Employee emp){
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		sn.save(emp);
		sn.flush();
		tx.commit();
		sn.close();
		
	}

	public Employee getEmployee(Long id) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		Employee emp =sn.get(Employee.class,id);
		sn.flush();
		tx.commit();
		sn.close();
		return emp;
		
	}

	public Employee getEmployeeJPA(Long id) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		Employee emp =sn.get(Employee.class,id);
		sn.flush();
		tx.commit();
		sn.close();
		return emp;
		
	}
	
	public List<Employee> getEmployeesHQL() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		String hql = "select E FROM  Employee E";
		Query<Employee> query = sn.createQuery(hql);
		List<Employee> results = query.list();
		sn.flush();
		tx.commit();
		sn.close();
		return results;
		
	}
	
	public int updateEmployee() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		String hql = "UPDATE Employee set salary = :salary "  + 
	             "WHERE id = :employee_id";
	    Query query = sn.createQuery(hql);
	    query.setParameter("salary", Long.valueOf(1000));
	   query.setParameter("employee_id", Long.valueOf(100));
	   int result = query.executeUpdate();
	   System.out.println("Rows affected: " + result);
	   	sn.flush();
		tx.commit();
		sn.close();
		return result;
		
		
	}
	
	public List<Employee> getEmployeesHQLWithConditions() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		String hql = "FROM  Employee E where E.first_name like :name "
				   + " ORDER BY E.first_name ";
				   
		Query<Employee> query = sn.createQuery(hql);
		query.setParameter("name", "D%");
		List<Employee> results = query.list();
		sn.flush();
		tx.commit();
		sn.close();
		return results;
		
	}
	
	public List<Employee> getEmployeesHQLWithGrpBy() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		String hql = "Select count(E.last_name) AS CJBID, E.job_id FROM  Employee E where E.first_name like :name "
				   + " GROUP BY E.job_id "
				   + " Having count(E.last_name) >2 ";
				   
		Query<Employee> query = sn.createQuery(hql);
		query.setParameter("name", "D%");
		List<Employee> results = query.list();
		sn.flush();
		tx.commit();
		sn.close();
		return results;
		
	}
	
	public List<Employee> getEmployeesHQLFromDeptt() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().
				addAnnotatedClass(Department.class).buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
	
//		String hql = "Select E.last_name AS CJBID, D.department_name "
//				+ "  FROM  Department as D inner join D.employees as E"
//				+ " where E.first_name = 'Steven' "
//				+ " AND D.department_name ='Executive' ";
//		
		
		String hql = "Select E.last_name AS CJBID, D.department_name "
				+ "  FROM  Employee E, Department D "
				+ " -- where E.first_name = 'Steven' "
				+ " where D.department_name = 'Executive'" 
				+ " AND D.department_id = E.department_id"
				;
			
				   
		Query<Employee> query = sn.createQuery(hql);
		//query.setParameter("name", "Austin");
		//query.setParameter("adm", "Administration");
		List<Employee> results = query.list();
		sn.flush();
		tx.commit();
		sn.close();
		return results;
		
	}
	
	
	
	
	
	public List<Employee> getEmployeesCritWithGrpBy() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		/*
		String hql = "Select count(E.last_name) AS CJBID, "
				+ "E.job_id FROM  Employee E where E.first_name like :name "
				   + " GROUP BY E.job_id "
				   + " Having count(E.last_name) >2 ";
	    			   
		Query<Employee> query = sn.createQuery(hql);
		query.setParameter("name", "D%");
		List<Employee> results = query.list();
		*/
		 
		sn.flush();
		tx.commit();
		sn.close();
		return null;
		
	}
	
	
	
	
}
