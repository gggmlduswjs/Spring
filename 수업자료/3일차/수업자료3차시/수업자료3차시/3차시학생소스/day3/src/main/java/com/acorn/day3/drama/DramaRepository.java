package com.acorn.day3.drama;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DramaRepository {
	
	@Autowired
	DataSource ds;

	public ArrayList<Drama> selectAll() {
		String sql = "select * from drama_tbl";
		ArrayList<Drama>  list = new ArrayList<Drama>();
		Drama drama = new Drama();
		
		Connection con=null;
		PreparedStatement pst  =null;
		ResultSet rs  = null;
		
		try {
			  con = ds.getConnection();
			  pst = con.prepareStatement(sql);
			  rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				
				list.add( new Drama(rs.getString(1) ,rs.getString(2),rs.getString(3)));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		 
	}
}


/*
  1. 테이블 생성
CREATE TABLE drama_tbl (
    code   VARCHAR2(20) PRIMARY KEY,
    title  VARCHAR2(100),
    actors VARCHAR2(200)
);

2. 데이터 5개 INSERT
INSERT INTO drama_tbl (code, title, actors) VALUES 
('D001', '미스터 션샤인', '이병헌, 김태리');

INSERT INTO drama_tbl (code, title, actors) VALUES 
('D002', '도깨비', '공유, 김고은, 이동욱');

INSERT INTO drama_tbl (code, title, actors) VALUES 
('D003', '슬기로운 의사생활', '조정석, 유연석, 정경호');

INSERT INTO drama_tbl (code, title, actors) VALUES 
('D004', '이상한 변호사 우영우', '박은빈, 강태오');

INSERT INTO drama_tbl (code, title, actors) VALUES 
('D005', '킹덤', '주지훈, 배두나');
*/