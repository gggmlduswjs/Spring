package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// @Component  동일하다 
@Repository
public class MemberRepository {

	// 주입받아야 한다
	// 필드 주입
	@Autowired
	DataSource ds;

	// selectAll
	public ArrayList<Member> selectAll() {

		
		ArrayList<Member> list = new ArrayList<>();
		try {

			Connection con = ds.getConnection();
			PreparedStatement   pst  =con.prepareStatement("select * from member_tbl_11 ");
			ResultSet rs  = pst.executeQuery(); 
			
			while( rs.next()) {   				
				System.out.println( rs.getString(1));  //id
				System.out.println( rs.getString(2));  //pw
				System.out.println( rs.getString(3));   // name
				
				String id  = rs.getString(1);  //id
				String pw=  rs.getString(2);  //pw
				String name = rs.getString(3);   // name
				
				Member m  = new Member( id, pw, name );
				list.add(m); 
			} 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	

}
