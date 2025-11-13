package com.acorn.model.t;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Setter @Getter @ToString 
//@Setter @Getter @ToString(of = {"id"  ,"pw" })
@Setter @Getter @ToString(of = {"id"   })
public class Member {

	
	String id;
	String pw;
	
}
