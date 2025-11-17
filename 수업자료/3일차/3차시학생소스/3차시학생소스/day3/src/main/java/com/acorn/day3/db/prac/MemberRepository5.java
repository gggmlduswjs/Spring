package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 

@Repository
public class MemberRepository5 {
	
	@Autowired
	DataSource  ds;
	
	
	public  List<Member> selectAll(){
		
		
		String sql=" select * from member_tbl_11";
		
		
		try( 
				Connection con  = ds.getConnection();
				PreparedStatement pst= con.prepareStatement(sql);
				ResultSet rs  = pst.executeQuery();
				
			){
			
			
			
			while( rs.next()) {
				
				System.out.println( rs.getString(1));
				
			} 
			
			
		}catch( Exception e) {
			
		}
		
		return null;
		
	}

}
