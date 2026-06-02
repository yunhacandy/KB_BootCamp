package com.example.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

final class TestDatabase {

    private TestDatabase() {
    }

    static Connection createConnection() throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:h2:mem:person_test;MODE=MySQL;DB_CLOSE_DELAY=-1",
                "sa",
                ""
        );

        runSchema(con);

        return con;
    }

    private static void runSchema(Connection con) throws Exception {
        try (Statement stmt = con.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS person");

            stmt.execute("""
                    CREATE TABLE person (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(50) NOT NULL
                    )
                    """);
        }
    }
}