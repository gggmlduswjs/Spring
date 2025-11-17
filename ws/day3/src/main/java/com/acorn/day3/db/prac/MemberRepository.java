package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Component
public class MemberRepository {
	
	@Autowired
	DataSource ds;
	
	
	//전체조회하기		
	public ArrayList<Member>  selectAll(){	
		
		ArrayList<Member> list = new ArrayList<>();
		
		try {
		 Connection con =	ds.getConnection();
		 String sql ="select * from member_tbl_11";
		 
		 PreparedStatement  pst  = con.prepareStatement(sql);
		 ResultSet   rs  = pst.executeQuery();
		 
		 while( rs.next()) {
			 
			 Member m  = new Member( rs.getString(1) , rs.getString(2), rs.getString(3), rs.getString(4) );
			 list.add(m);		 
		 } 
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return list;		 
	}
	

}
