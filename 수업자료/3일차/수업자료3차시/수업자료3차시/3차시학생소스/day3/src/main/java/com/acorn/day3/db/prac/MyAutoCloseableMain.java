package com.acorn.day3.db.prac;

public class MyAutoCloseableMain {

	public static void main(String[] args) {		
		
		MyConnection con = new MyConnection();
		MyPreparedStatement pst = new  MyPreparedStatement();
	    MyResultSet rs  = new 	MyResultSet();			
	    close3(con, pst, rs);
	    
		MyConnection con2 = new MyConnection();
		MyPreparedStatement pst2 = new  MyPreparedStatement();		
	    close3(con2, pst2);		
		

	}
	
	
	//매서드
	public  static  void close0( MyConnection a, MyPreparedStatement b,  MyResultSet c  ) {
		
	}

	public  static  void close( MyAutoCloseable a, MyAutoCloseable b,  MyAutoCloseable c  ) {
		
	}

	public  static  void close2( MyAutoCloseable a, MyAutoCloseable b  ) {
		
	}
	
	//가변인자 
    public  static  void close3(  MyAutoCloseable ...autoCloseables ) {
    	for( MyAutoCloseable   itemm :autoCloseables ) {
    		itemm.close();
    	}
		
	}
	

}
