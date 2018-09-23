/**
 * 
 */
package com.mysystems.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;


public class JDBCOracle
{
	private static String dbURL = "jdbc:oracle:thin:hr/full2fun@localhost:1521/XE";
	//private static String dbURL = "jdbc:derby:myDB;create=true;user=me;password=mine";
    private static String tableName = "restaurants";
    // jdbc Connection
    private static Connection conn = null;
    private static Statement stmt = null;

    public static void main(String[] args)
    {
        createConnection();
        insertRestaurants(5, "LaVals", "Berkeley");
        selectRestaurants();
        shutdown();
    }
    
    private static void createConnection()
    {
        try
        {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //Get a connection
            conn = DriverManager.getConnection(dbURL);
            
            
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    private static void insertRestaurants(int id, String restName, String cityName)
    {
        try
        {
            stmt = conn.createStatement();
            
            stmt.execute("insert into " + tableName + " values (" +
                    id + ",'" + restName + "','" + cityName +"')");
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static void selectRestaurants()
    {
        try
        {
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("select * from " + tableName);
            ResultSetMetaData rsmd = results.getMetaData();
            int numberCols = rsmd.getColumnCount();
            for (int i=1; i<=numberCols; i++)
            {
                //print Column Names
                System.out.print(rsmd.getColumnLabel(i)+"\t\t");  
            }

            System.out.println("\n-------------------------------------------------");

            while(results.next())
            {
                int id = results.getInt(1);
                String restName = results.getString(2);
                String cityName = results.getString(3);
                System.out.println(id + "\t\t" + restName + "\t\t" + cityName);
            }
            DatabaseMetaData  dbmd = conn.getMetaData();
			dbmd.getDriverName();
			String  s1 = dbmd.getURL();
			String  s2 = dbmd.getSQLKeywords();
			boolean b1 = dbmd.supportsTransactions();
			boolean b2 = dbmd.supportsSelectForUpdate();
			//ResultSetMetaData rsmd = rset.getMetaData();
			rsmd.getColumnCount();
            results.close();
            stmt.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
    private static void shutdown()
    {
        try
        {
            if (stmt != null)
            {
                stmt.close();
            }
            if (conn != null)
            {
                DriverManager.getConnection(dbURL + ";shutdown=true");
                conn.close();
            }           
        }
        catch (SQLException sqlExcept)
        {
            
        }

    }
}
