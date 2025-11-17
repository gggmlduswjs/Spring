package com.acorn.batis2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 /*  
   create table ordera(
     orderno varchar2(10) primary key, 
     userid  varchar2(10),
     username varchar2(20),
     tel    varchar2(20) ,
     price   varchar2(10)  
 );
 
    
  create table membera (
    userid  varchar2(10) ,
    username varchar2(20),   
    tel  varchar2(20) 
  ); 
  
  
  
  */

@Repository
public class OrderRepository {
	 @Autowired
	    private SqlSession session;
	    private static String namespace = "com.acorn.OrderMapper.";

	  
	    
	    public List<OrderDTO> selectAll() throws Exception {
	        return session.selectList(namespace+"selectAll");
	    } // List<E> selectList(String statement)
	
	    
	    
	    public List<OrderDTO> selectAll2() throws Exception {
	        return session.selectList(namespace+"selectAll2");
	    } //
	     
	    
	    
	    public List<Map<String, Object>> selectAll3() throws Exception {
	        return session.selectList(namespace+"selectAll3");
	    } //
	    
	    
}
