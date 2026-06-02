package com.example.jdbc.dao;

import com.example.jdbc.common.DBUtil;
import com.example.jdbc.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final DBUtil dbUtil;

    public UserDao(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    //1번
    public int insert(User user) throws SQLException {
        String sql = """
                INSERT INTO users(userid, username, userpassword, userage, useremail)
                VALUES (?, ?, ?, ?, ?)
                """;

        try (
                Connection con = dbUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)
        ) {
            pstmt.setString(1, user.getUserId());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getUserPassword());
            pstmt.setInt(4, user.getUserAge());
            pstmt.setString(5, user.getUserEmail());

            return pstmt.executeUpdate();
        }
    }

    //2번
    public void findUserById(String userId) throws SQLException {
        String sql = """
                SELECT userid, username, userage, useremail
                FROM users
                WHERE userid = ?
                """;

        try (
                Connection con = dbUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)
        ) {
            pstmt.setString(1, userId);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("userid = " + rs.getString("userid"));
                    System.out.println("username = " + rs.getString("username"));
                    System.out.println("age = " + rs.getInt("userage"));
                    System.out.println("email = " + rs.getString("useremail"));
                } else {
                    System.out.println("조회된 회원이 없습니다.");
                }
            }
        }
    }

    //3번
    public void findAllUsers() throws SQLException {
        String sql = """
                SELECT userid, username, userage, useremail
                FROM users
                ORDER BY userid
                """;

        try (
                Connection con = dbUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()
        ) {
            while (rs.next()) {
                System.out.println("userid = " + rs.getString("userid"));
                System.out.println("username = " + rs.getString("username"));
                System.out.println("age = " + rs.getInt("userage"));
                System.out.println("email = " + rs.getString("useremail"));
                System.out.println("------------------------");
            }
        }
    }
}