/**
 * 
 */
package com.mysystems.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysystems.PkgA;

/**
 * @author gy
 *
 */
public class JDBCDbTest {
	int i;
	
	
	public void testConnect() {
		//String dbUrl = "jdbc:oracle:thin:hr/full2fun@localhost:1521/XE";
		String dbUrl1 = "jdbc:oracle:thin:@localhost:1521/XE";
		String dbClass = "oracle.jdbc.driver.OracleDriver";	// String dbClass = "com.mysql.jdbc.Driver";
		String query = "select * from Employees ";
		String query2 = "select * from Countries where country_name like 'I%'";
		String username = "hr";		String password = "hr";
		int abcd =20;
		Connection connection =null;
		Statement statement = null;
		ResultSet rs1 =null;
		try {
			 Class.forName(dbClass); //Loading or register
			connection =
			DriverManager.getConnection(dbUrl1,username, password);
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			Statement statement1 = connection.createStatement();
			 rs1 = statement.executeQuery(query);
			ResultSet rs2 = statement1.executeQuery(query2);
			List lstCountry = new ArrayList();
			while(rs2.next()){
				//String s1 = rs2.getString(1);
				String s1 = rs2.getString("COUNTRY_ID");
				String s2 = rs2.getString(2);
				int s3 = rs2.getInt(3);
				lstCountry.add(s2);
				
				System.out.println(s1+" "+s2+" "+s3);
			}
			
			
			
			
		
		
			PreparedStatement pstmt = connection
					.prepareStatement("select * from COUNTRIES where COUNTRY_ID=? and REGION_ID=?");
			String mypar = "IL";
			pstmt.setString(1, mypar);
			pstmt.setInt(2, 4);
			
			 ResultSet resultSet3 = pstmt.executeQuery();
			  
			  while (resultSet3.next()) { 
				  String tableName =
			  resultSet3.getString(1); 
				  String tableName1 = resultSet3.getString("COUNTRY_ID"); 
				  String col2 =		  resultSet3.getString(2);
			  
			  System.out.println("Table name : " + tableName+" "+col2); }
			
			
			ResultSet resultSet = statement.executeQuery(query);
			
					
			

			try{
			Statement statementTrans = connection.createStatement();
			int countUp2 = statementTrans
					.executeUpdate("UPDATE restaurants SET name = 'BOB77' WHERE id =2");
			
			int countUp = statementTrans
					.executeUpdate
					("insert into restaurants values (44, 'Abhinav2', 'San Mateo2')");

		connection.commit();
			}catch(SQLException se)
			{
		connection.rollback();
			}

			
			
			 

			String getCountryIdSql = 
					"{call getCountryById(?,?,?)}";
			CallableStatement cstmt = 
					connection.prepareCall(getCountryIdSql);
			cstmt.setString(1, "US");
			cstmt.setInt(2, 2);
			cstmt.registerOutParameter(3, 
					java.sql.Types.VARCHAR);
			cstmt.execute();
			String result = cstmt.getString(3);
			//String abc;

			
			/*
			while (resultSet.next()) { String tableName =
			 resultSet.getString(1); 
			 //String tableName1 =resultSet.getString("COUNTRY_ID"); 
			 String col2 = resultSet.getString(2);
			
			 System.out.println("Table name : " + tableName+" "+col2); }
			
			 resultSet.close(); statement.close();
			
			 
			 while (resultSet1.next()) { String tableName =
			 resultSet1.getString(1); System.out.println("Table name : " +
			 tableName); }
			 

			
			ResultSetMetaData rsmd = resultSet1.getMetaData();
			int numberCols = rsmd.getColumnCount();
			System.out.print(rsmd.getTableName(0) + "\t");

			for (int i = 1; i <= numberCols; i++) {
				// print Column Names
				System.out.print(rsmd.getColumnLabel(i) + "\t");
				System.out.print(rsmd.getColumnTypeName(i) + "\t");

			}

			DatabaseMetaData dbmd = connection.getMetaData();
			String s0 = dbmd.getDriverName();
			String s11 = dbmd.getDatabaseProductName();
			String s1 = dbmd.getURL();
			String s2 = dbmd.getSQLKeywords();
			boolean b1 = dbmd.supportsTransactions();
			boolean b2 = dbmd.supportsSelectForUpdate();

			resultSet1.close();
			statement1.close();

			connection.close();
			*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			try {
				connection.close();
				statement.close();
				rs1.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	}
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JDBCDbTest jdbctest = new JDBCDbTest();
		jdbctest.testConnect();

	}
	

		
}
