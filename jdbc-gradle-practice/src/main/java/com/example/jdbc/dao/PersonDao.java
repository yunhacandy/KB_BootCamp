package com.example.jdbc.dao;

import com.example.jdbc.common.DBUtil;
import com.example.jdbc.domain.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDao {
    //1번
    private final DBUtil dbUtil;

    public PersonDao(DBUtil dbUtil) {
        this.dbUtil = dbUtil;
    }

    //2번
    public int insert(Person person) throws SQLException {
        String sql = "INSERT INTO person(id, name) VALUES(?, ?)";

        try (
                Connection conn = dbUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, person.getId());
            pstmt.setString(2, person.getName());

            return pstmt.executeUpdate();
        }
    }

    //3번
    public Optional<Person> findById(int id) throws SQLException {
        String sql = "SELECT id, name FROM person WHERE id = ?";

        try (
                Connection conn = dbUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    Person person = new Person(
                            rs.getInt("id"),
                            rs.getString("name")
                    );

                    return Optional.of(person);
                }

                return Optional.empty();
            }
        }
    }

    //4번
    public List<Person> findAll() throws SQLException {
        String sql = "SELECT id, name FROM person";

        List<Person> people = new ArrayList<>();

        try (
                Connection conn = dbUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()
        ) {
            while (rs.next()) {
                Person person = new Person(
                        rs.getInt("id"),
                        rs.getString("name")
                );

                people.add(person);
            }
        }

        return people;
    }
}