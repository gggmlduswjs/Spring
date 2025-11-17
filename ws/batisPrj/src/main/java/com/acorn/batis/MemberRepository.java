package com.acorn.batis;

 

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 


@Repository
public class MemberRepository  {
    @Autowired
    private SqlSession session;
    
    
    // 템플릿 매서드 사용해서 crud 진행
    // sql 작성 -> mapper
    
    
    
    private static String namespace = "com.acorn.MemberMapper."; // mapper 이름 식별, 별칭
    
    
    
    

    public int count() throws Exception {
        return session.selectOne(namespace+"count");
    }     
   
    public List<Member> selectAll() throws Exception {
        return session.selectList(namespace+"selectAll");	// 매터식별자.id 이름 
    } // List<E> selectList(String statement)

   
    
    public int deleteAll()  throws Exception{
        return session.delete(namespace+"deleteAll");
    } // int delete(String statement)

    
    
    public int delete( String id) throws Exception {          
        return   session.delete(namespace+"delete", id);
    } // int delete(String statement, Object parameter)

    
    public int insert(Member dto) throws Exception {
        return session.insert(namespace+"insert", dto);
    } // int insert(String statement, Object parameter)

    
    public Member select(Integer bno) throws Exception {
        return session.selectOne(namespace + "select", bno);
    } // T selectOne(String statement, Object parameter)

    // List<E> selectList(String statement, Object parameter)

    
    public int update(Member dto) throws Exception {
        return session.update(namespace+"update", dto);
    } // int update(String statement, Object parameter)

}
 