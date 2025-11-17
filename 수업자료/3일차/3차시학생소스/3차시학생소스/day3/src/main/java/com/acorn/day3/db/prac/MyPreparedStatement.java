package com.acorn.day3.db.prac;

public class MyPreparedStatement  implements MyAutoCloseable{

	@Override
	public void close() {
		System.out.println("MyPreparedStatement  close 하기 ");
		
	}

}
