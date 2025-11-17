package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTEST2 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";
 
		
		
		try {
			Class.forName(driver);
			
			
			try(    Connection con = DriverManager.getConnection(url, user, password);
	                PreparedStatement pst = con.prepareStatement("select * from member_tbl_11");
	                ResultSet rs = pst.executeQuery() 
					
					){    // con, pst, rs      // try-with-resources  (리소스 자동해제 : close()매서드 호출하는 코드로 넣어줌)
				
				
				System.out.println( "db연동");				
				while( rs.next()) {
					
					System.out.println( rs.getString(1));
					System.out.println( rs.getString(2));
					System.out.println( rs.getString(3));
					
				}
				
				
			}catch( Exception e ) { 
			 
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		 
	}

}
