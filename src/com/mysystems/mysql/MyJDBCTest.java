package com.mysystems.mysql;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mysystems.MyJDBC;

class MyJDBCTest {

	@Test
	void testRunJDBC() {
		MyJDBC myj= new MyJDBC();
		myj.runJDBC();
	}
	
	@Test
	void testGetDbMetaData() {
		MyJDBC myj= new MyJDBC();
		myj.getDbMetaData();
	}
	
	@Test
	void testRunPrepStmt() {
		MyJDBC myj= new MyJDBC();
		myj.runPrepStmt();
	}
	

	@Test
	void testRunCallableStmt() {
		MyJDBC myj= new MyJDBC();
		myj.runCallableStmt();
	}
	
	@Test
	void testTransaction() {
		MyJDBC myj= new MyJDBC();
		myj.runCallableStmt();
	}
	
	
	
	

}
