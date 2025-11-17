package com.acorn.day3.db;

import java.sql.*;

 

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTest2 {

	public static void main(String[] args) throws SQLException {
		 
		
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		//DriverManagerDataSource 사용하기 
		//내부적으로 커넥션풀링 기법을 사용함 
		

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		
		Connection con  =ds.getConnection();
		System.out.println( con);
		if( con != null) System.out.println("ok");
		
		 
		
		

	}

}
