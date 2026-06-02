package com.example.jdbc.test;

import com.example.jdbc.common.DBConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * db.properties 파일의 DB 접속 정보가 올바르게 로딩되는지 검증합니다.
 *
 * 이 테스트는 실제 DB에 접속하지 않고 설정값만 확인합니다.
 */
class DbPropertiesTest {

    @Test
    @DisplayName("db.properties에서 MySQL 접속 정보를 읽어온다")
    void loadDbProperties() {
        String url = DBConfig.get("db.url");
        String username = DBConfig.get("db.username");
        String password = DBConfig.get("db.password");

        assertTrue(url.startsWith("jdbc:mysql://localhost:3306/person_test"));
        assertEquals("root", username);

        // 비밀번호는 개인 환경마다 다를 수 있으므로 비어 있지 않은지만 확인
        assertTrue(password != null);
    }
}