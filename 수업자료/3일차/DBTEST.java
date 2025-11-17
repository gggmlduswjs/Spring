package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTEST {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";

		Connection  con= null;
		PreparedStatement  pst =null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			//connection 얻어오기
		    con  =DriverManager.getConnection(url, user, password);
			
			//sql작성하기
			String sql  ="select *  from  member_tbl_11";
			
			pst  = con.prepareStatement(sql);
			
			
			rs  = pst.executeQuery();
			
			while( rs.next()) {
				System.out.println( rs.getString(1));
				System.out.println( rs.getString(2));
				System.out.println( rs.getString(3));
				
			} 

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { 
			
			//리소스 
			
			if( rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
			// statement 리소스 해제
			if( pst  != null) {
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			//
			if( con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}

	}

}
