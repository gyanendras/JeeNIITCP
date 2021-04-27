package com.mysystems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.ListJoin;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.SetJoin;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysystems.domain.Department;
import com.mysystems.domain.Employee;
public class DepartmentDAO {
	
	
	public List<Department> getDepartments() {
		Connection con = MYSQLConnection.getConnection();
		String query = "Select * from departments";
		List<Department> deptList = new ArrayList<Department>();

		try (Statement stmt = con.createStatement()) { // try with resources
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Department dept = new Department();
				dept.setDepartment_id(rs.getInt(1));
				dept.setDepartment_name(rs.getString(2));
				dept.setLocation_id(rs.getInt(4));
				dept.setManager_id(rs.getInt(3));
				deptList.add(dept);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deptList;
	}
	
	public Department getDepartmentById(int department_id, List<Department> deptList) {
		Department deptt=null;
		for(Department dpt:deptList) {
			Integer l1=dpt.getDepartment_id();
			Integer l2=department_id;
			if(l1.equals(l2)) {
				deptt=dpt;
			}
		}
		return deptt;
	}

	public void addDepartment(Department deptt){
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().
				 addAnnotatedClass(Department.class).buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		sn.save(deptt);
		sn.flush();
		tx.commit();
		sn.close();
		
	}
	
	public void addDepartmentByJPA(Department deptt){
		EntityManagerFactory emFactory = 
				Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		 em.getTransaction()
		        .begin();
		    
		    em.persist(deptt);
		  
		   
		 em.getTransaction()
		        .commit();
		    em.close();
		    
		  }		
	
	public List<Department> getDepartmentsByCrit() {
		EntityManagerFactory emFactory = 
				Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		 em.getTransaction()
		        .begin();
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 CriteriaQuery<Department> cq = cb.createQuery(Department.class);
		 
		 Root<Department> root = cq.from(Department.class);
		 //cq.select(root);
		 
		 Metamodel m = em.getMetamodel();
		 EntityType<Department> Dept_ = m.entity(Department.class);
		 Expression ex = root.get(Dept_.getSingularAttribute("department_id"));
		 Expression LcnEx = root.get(Dept_.getSingularAttribute("location_id"));

		 Predicate p1 = cb.equal(ex,10);
		 Predicate p2 = cb.equal(ex,30);
		 Predicate p3 = cb.equal(ex,90);
		 Predicate p4 = cb.equal(ex,40);
		 Predicate p5= cb.or(p1,p2,p3,p4);
		 //where location_id =1700 and deptId=200 or deptId= 201
		 cq.where(p5);
	 
		 cq.select(cb.max(LcnEx));
		 ArrayList ar;
		 
		 List<Department> ls = em.createQuery(cq).getResultList();
		 
		    em.getTransaction()
		        .commit();
		    em.close();
		    return ls;
}

	public List<Tuple> getDepartmentsByCritGrpBy() {
		EntityManagerFactory emFactory = 
				Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		 em.getTransaction()
		        .begin();
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 //CriteriaQuery<Department> cq = cb.createQuery(Department.class);
		 CriteriaQuery<Tuple> cq = cb.createTupleQuery();
		 Root<Department> root = cq.from(Department.class);
		 //cq.select(root);
		 
		 Metamodel m = em.getMetamodel();
		 EntityType<Department> Dept_ = m.entity(Department.class);
		 Expression ex = root.get(Dept_.getSingularAttribute("department_id"));
		 Expression LcnEx = root.get(Dept_.getSingularAttribute("location_id"));

		 Predicate p1 = cb.equal(ex,10);
		 Predicate p2 = cb.equal(ex,30);
		 Predicate p3 = cb.equal(ex,90);
		 Predicate p4 = cb.equal(ex,40);
		 Predicate p5= cb.or(p1,p2,p3,p4);
		 //where location_id =1700 and deptId=200 or deptId= 201
		 cq.where(p5);
		 cq.groupBy(LcnEx);		 
		 
		 cq.multiselect(cb.max(ex),LcnEx);
		 
		 List<Tuple> ls = em.createQuery(cq).getResultList();
		 
		    em.getTransaction()
		        .commit();
		    em.close();
		    return ls;
}	

	public List<Tuple> getDepartmentsByCritJoin() {
		EntityManagerFactory emFactory = 
				Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emFactory.createEntityManager();
		 em.getTransaction()
		        .begin();
		 CriteriaBuilder cb = em.getCriteriaBuilder();
		 //CriteriaQuery<Department> cq = cb.createQuery(Department.class);
		 CriteriaQuery<Tuple> cq = cb.createTupleQuery();
		 Root<Department> root = cq.from(Department.class);
	 
		 Metamodel m = emFactory.getMetamodel();
		 EntityType<Department> Dept_ = m.entity(Department.class);
		 Expression ex = root.get(Dept_.getSingularAttribute("department_id"));
		 Expression LcnEx = root.get(Dept_.getSingularAttribute("location_id"));
		 
		 
		 
		 ListJoin<Department, Employee> o =  
				 root.join(Dept_.getDeclaredList("employees",Employee.class));

		 Predicate p1 = cb.equal(ex,10);
		 Predicate p2 = cb.equal(ex,30);
		 Predicate p3 = cb.equal(ex,90);
		 Predicate p4 = cb.equal(ex,40);
		 Predicate p5= cb.or(p1,p2,p3,p4);
		 //where location_id =1700 and deptId=200 or deptId= 201
		 cq.where(p5);
		 //cq.groupBy(LcnEx);
		 Order oLcn = cb.desc(LcnEx);
		 cq.orderBy(oLcn);
		 
		 cq.multiselect(ex,LcnEx,o);
		 
		 List<Tuple> ls = em.createQuery(cq).getResultList();
		 
		    em.getTransaction()
		        .commit();
		    em.close();
		    return ls;
}	
	
	public List<Department> getDepttFromHQL() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().addAnnotatedClass(Department.class).buildSessionFactory();
		Session sn = sf.openSession();
		Transaction tx = sn.beginTransaction();
		String hql = "Select D.department_id, D.department_name "
				+ "  FROM Department D "
				+ "where D.department_name like :name ";
				   
		Query<Department> query = sn.createQuery(hql);
		query.setParameter("name", "C%");
		List<Department> results = query.list();
		sn.flush();
		tx.commit();
		sn.close();
		return results;
		
	}

	
	
	
	
}
