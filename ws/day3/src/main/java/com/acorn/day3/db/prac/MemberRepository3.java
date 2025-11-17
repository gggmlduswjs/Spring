package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Repository;
@Repository
public class MemberRepository3 {

    @Autowired
    DataSource ds;

    // 전체 조회
    public ArrayList<Member> selectAll() {

        ArrayList<Member> list = new ArrayList<>();

        String sql = "select * from member_tbl_11";

        try (
            Connection con = ds.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        ) {

            while (rs.next()) {
                Member m = new Member(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                list.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
