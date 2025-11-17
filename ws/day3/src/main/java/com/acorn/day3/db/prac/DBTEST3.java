package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTEST3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		

		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		
		//
		// DataSource    인터페이스 
		
		// spring  -> DataSource의 구현체  DriverManagerDataSource();
		
		DriverManagerDataSource ds  = new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		
		
		
		Connection  con =	ds.getConnection();
		String sql =" select * from  member_tbl_11";			
		PreparedStatement  pst  = con.prepareStatement(sql);
		ResultSet  rs = pst.executeQuery();
		
		
		while( rs.next()) {  //true, false
			
			System.out.println( rs.getString(1));
			System.out.println( rs.getString(2));
			System.out.println( rs.getString(3));
			System.out.println( rs.getString(4));
		}
		
		
		
		
		
	}

}
