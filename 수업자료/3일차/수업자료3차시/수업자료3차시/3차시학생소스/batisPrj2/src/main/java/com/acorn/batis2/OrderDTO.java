package com.acorn.batis2;

import lombok.Data;

/*
 * 

  
 * 
 */

@Data
public class OrderDTO {
	
	String orderno;  //주문번호
	String userid;   //사용자id
	String name;    //이름 (컬럼명과 다르게 작성하였음), 바인딩 실패
	String tel;
	String price ;//  총주문금액
	
  
}
