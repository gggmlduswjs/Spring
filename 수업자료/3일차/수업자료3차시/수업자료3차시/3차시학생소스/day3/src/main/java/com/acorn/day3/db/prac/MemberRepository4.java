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
public class MemberRepository4 {
	
	@Autowired
	DataSource ds;
	
	
	//전체조회하기		
	public ArrayList<Member>  selectAll(){	
		
		ArrayList<Member> list = new ArrayList<>();
		Connection con=null  ;
		PreparedStatement  pst=null;
		 ResultSet   rs= null;
		try {
		 con =	ds.getConnection();
		 String sql ="select * from member_tbl_11";
		 
		 pst  = con.prepareStatement(sql);
		 rs  = pst.executeQuery();
		 
		 while( rs.next()) {
			 
			 Member m  = new Member( rs.getString(1) , rs.getString(2), rs.getString(3), rs.getString(4) );
			 list.add(m);		 
		 } 
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {   // 모든경우에 수행되는 구문 
			
			close(  rs, con);
			 
			
		}		
		return list;		 
	}
	
	
	
	// 등록하기 
	public int  insert( Member member) {
		
		
		Connection con  = null;
		PreparedStatement pst  = null;
		int rowCnt=0;
		/*
		 * 
		 * -------- -------- ------------ 
M_ID       NOT NULL VARCHAR2(5)  
M_PW                VARCHAR2(5)  
M_NAME              VARCHAR2(10) 
M_TEL               VARCHAR2(13) 
		 */
		
		try {
			con =ds.getConnection();
			String sql =" insert into member_tbl_11(m_id, m_pw, m_name, m_tel) values(?,?,?,?)";
			pst =con.prepareStatement(sql);
			pst.setString(1, member.getId());
			pst.setString(2, member.getPw());
			pst.setString(3, member.getName());
			pst.setString(4, member.getTel());	
			
			
			rowCnt=pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close( pst, con);
		}
		 
		return rowCnt;
		
		
		
	}
	
	
	
	
	
	
	// AutoCloseable  인터페이스를 모두 구현하였음
	private  void  close( AutoCloseable ...autoCloseables) {   // Connection, PreparedStatement, RessultSet 객체 close를 호출하는 매서드 
		
		for(AutoCloseable   item :   autoCloseables) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
