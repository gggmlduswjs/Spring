package com.acorn.day3.db;

 

import java.sql.*;

public class DBTest0 {

    public static void main(String[] args) {

        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:testdb";
        String user = "scott";
        String password = "tiger";

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);

            System.out.println("DB 연결 성공");

            String sql = "select * from member_tbl_11";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
                System.out.println("리소스 해제 완료");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
