package com.mysystems;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Calendar;
import java.util.GregorianCalendar;



import java.util.Date;

public class MyJDBC {
	public void runJDBC(){  
		Connection con=null;
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/hr","root","full2work");  
		/*
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employees  ");
		ResultSetMetaData rsm = rs.getMetaData();
		rsm.getColumnCount();
		rsm.getColumnName(1);
		rsm.getTableName(1);
		
		Statement stmt2=con.createStatement(); 
		ResultSet rs1 =stmt2.executeQuery("select * from locations  "); 
		while(rs1.next())  {
			System.out.println(
					rs1.getInt(1)+"  "
			+rs1.getString(2)+"  "+
							rs1.getString(3));
			}
		while(rs.next())  {
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "
		+rs.getInt("manager_id"));
		if(rs.wasNull()) {
			System.out.println("NO Value");
		}
		}
		String x = "insert into countries values ('BL2','Baloch2','4');";
		Statement stmt3=con.createStatement(); 
		int count =stmt3.executeUpdate(x); 
con.commit();
		*/
			
		con.setAutoCommit(false);
						
		String x1 = "insert into countries values ('BB','Baloch1','4');";
		String x2 = "insert into countries values ('BD','Baloch2','4');";
		Statement stmt4=con.createStatement(); 
		int count1 =stmt4.executeUpdate(x1); 
		int count2 =stmt4.executeUpdate(x2); 
		con.commit();
		/*		
		rs1.close();
				rs.close();
				stmt.close();
				stmt2.close();
				stmt3.close();
				*/
				con.close();  
				}catch(Exception e){ System.out.println(e);
				try {
					con.rollback();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}  
		}
	
	public void getDbMetaData() {
		
		try(Connection con = getConnection();) {

			
			DatabaseMetaData dm = con.getMetaData(); 
			dm.getDatabaseProductName();
			dm.getMaxColumnNameLength();
			dm.getMaxColumnsInGroupBy();
			dm.getURL();
			System.out.println(dm.getURL());
			
		   con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
				
			
		
	}

	private Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/hr","root","full2work");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return con;
	}
	
	public void runPrepStmt() {	
		String sql = "select * from employees where hire_date between ? and ? ";	
		try(
				Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				) {
     		Calendar cal = new GregorianCalendar();
			cal.set(1978,1,1);
			
			//Date dt = cal.getTime();
			java.sql.Date dtSql = new 	java.sql.Date(cal.getTimeInMillis());
			cal.set(1991,1,1);
			//Date dt1 = cal.getTime();
		
			java.sql.Date dt1Sql = new 	java.sql.Date(cal.getTimeInMillis());
			ps.setDate(1, dtSql);
			ps.setDate(2, dt1Sql);
	
			ResultSet rs = ps.executeQuery();
			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
  
	public void runCallableStmt() {
		try(Connection con = getConnection()){
		CallableStatement cstmt = 
				con.prepareCall("{call " +
				   "getEmployees" + 
				   "(?,?,?)}");
				  cstmt.registerOutParameter(3,Types.DATE);
				  Calendar cal = new GregorianCalendar();
					cal.set(1978,1,1);
					
					//Date dt = cal.getTime();
					java.sql.Date dtSql = new 	java.sql.Date(cal.getTimeInMillis());
					cal.set(1991,1,1);
					//Date dt1 = cal.getTime();
				
					java.sql.Date dt1Sql = new 	java.sql.Date(cal.getTimeInMillis());
					cstmt.setDate(1, dtSql);
					cstmt.setDate(2, dt1Sql);
					cstmt.execute();
					
					ResultSet rs = cstmt.getResultSet();
					
					//cstmt.getMoreResults();
					
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					}
					
					
					String s=cstmt.getString(3);
					System.out.println(s);
					
					
					
				  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}


