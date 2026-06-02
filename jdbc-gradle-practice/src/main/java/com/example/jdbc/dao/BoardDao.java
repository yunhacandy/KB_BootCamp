package com.example.jdbc.dao;

import com.example.jdbc.common.DBUtil;
import com.example.jdbc.domain.Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Optional;

public class BoardDao {
    private final DBUtil dbUtil;

    public BoardDao(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    //1번
    public int insert(Board board) throws SQLException {
        String sql = """
                INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)
                VALUES (?, ?, ?, NOW(), ?, ?)
                """;

        try (
                Connection con = dbUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            pstmt.setString(1, board.getTitle());
            pstmt.setString(2, board.getContent());
            pstmt.setString(3, board.getWriter());
            pstmt.setString(4, board.getFileName());
            pstmt.setBytes(5, board.getFileData());

            int result = pstmt.executeUpdate();
            if (result != 1) return -1;

            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }

            return -1;
        }
    }

    //2번
    public Optional<Board> findById(int bno) throws SQLException {
        String sql = """
                SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata
                FROM boards
                WHERE bno = ?
                """;

        try (
                Connection con = dbUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql)
        ) {
            pstmt.setInt(1, bno);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Board board = new Board(
                            rs.getString("btitle"),
                            rs.getString("bcontent"),
                            rs.getString("bwriter"),
                            rs.getString("bfilename"),
                            rs.getBytes("bfiledata")
                    );

                    board.setBno(rs.getInt("bno"));

                    Timestamp timestamp = rs.getTimestamp("bdate");
                    if (timestamp != null) {
                        board.setCreatedAt(timestamp.toLocalDateTime());
                    }

                    return Optional.of(board);
                }

                return Optional.empty();
            }
        }
    }

    public void findAllBoards() throws SQLException {
        String sql = """
                SELECT bno, btitle, bwriter, bdate, bfilename
                FROM boards
                ORDER BY bno DESC
                """;

        try (
                Connection con = dbUtil.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
        ) {
             while(rs.next()){
                 System.out.println("bno = " + rs.getString("bno"));
                 System.out.println("btitle = " + rs.getString("btitle"));
                 System.out.println("bwriter = " + rs.getInt("bwriter"));
                 System.out.println("bdate = " + rs.getString("bdate"));
                 System.out.println("bfilename = " + rs.getString("bfilename"));
                 System.out.println("------------------------");
             }
        }
    }
}