package com.acorn.prac.batis;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class BatisMemberRepository {

	
	//
	
	@Autowired
	SqlSession  sqlsession;
	
	
	  
    private static String namespace = "a.";   //mapper이름 식별  , 별칭 
    
  
	
    // 전체조회
    public  List<Member>  selectAll(){
		return  sqlsession.selectList(namespace+"selectAll");   //a.selectAll 
    }
    
    // 회원등록하기
    
    public int insert(Member member) {
    	
		return sqlsession.insert(namespace+"insert", member);
    	
    }
	
	
	
	
}
