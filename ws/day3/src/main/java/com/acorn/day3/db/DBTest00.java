package com.acorn.day3.db;

 

import java.sql.*;

public class DBTest00 {

    public static void main(String[] args) {

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:testdb";
        String user = "scott";
        String password = "tiger";

        try {
            Class.forName(driver);

            // try-with-resources  :
            //  자동 리소스 해제   
            //  컴파일러가 코드로 바꿔 넣는 것  ,컴파일 타임 code generation
            try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pst = con.prepareStatement("select * from member_tbl_11");
                ResultSet rs = pst.executeQuery()
            ) {
                System.out.println("DB 연결 성공");

                while (rs.next()) {
                    System.out.println(rs.getString(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getString(4));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
