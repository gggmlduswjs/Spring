package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTEST3 {
	
	public static void main(String[] args) throws SQLException {
		
		//
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		
		//db 연결을 스프링 통해서 데이터소스 DataSource(인터페이스) 구현 객체 얻어오기
		//DataSource(인터페이스)
		// -DriverManagerDataSource (스프링이 제공하는 구현체)
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		
		//연결정보
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(password);
		
		Connection con = ds.getConnection();
		System.out.println(con);
		
		//
		String sql="select*from member_tbl_11";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
		//
		rs.close();
		pst.close();
		con.close();
		
		
		
		
		
	}

}
