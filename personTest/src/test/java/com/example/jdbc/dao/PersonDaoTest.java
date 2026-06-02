package com.example.jdbc.dao;

import com.example.jdbc.domain.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonDaoTest {

    private PersonDao personDao;
    private Connection con;

    @BeforeEach
    void setUp() throws Exception {
        personDao = new PersonDao();
        con = TestDatabase.createConnection();
    }

    @AfterEach
    void tearDown() throws Exception {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    @Test
    @DisplayName("person 데이터를 저장하고 id로 조회할 수 있다")
    void insertAndFindById() throws Exception {
        Integer savedId = personDao.insert(
                con,
                Person.builder()
                        .name("홍길동")
                        .build()
        );

        Optional<Person> found = personDao.findById(con, savedId);

        assertNotNull(savedId);
        assertEquals(1, savedId);
        assertTrue(found.isPresent());
        assertEquals(savedId, found.get().getId());
        assertEquals("홍길동", found.get().getName());
    }

    @Test
    @DisplayName("존재하지 않는 id는 Optional.empty를 반환한다")
    void findByIdReturnsEmpty() throws Exception {
        Optional<Person> found = personDao.findById(con, 999);

        assertTrue(found.isEmpty());
    }

    @Test
    @DisplayName("전체 person 목록을 id 내림차순으로 조회한다")
    void findAll() throws Exception {
        Integer firstId = personDao.insert(
                con,
                Person.builder()
                        .name("강감찬")
                        .build()
        );

        Integer secondId = personDao.insert(
                con,
                Person.builder()
                        .name("이순신")
                        .build()
        );

        List<Person> people = personDao.findAll(con);

        assertEquals(2, people.size());

        // 현재 PersonDao가 ORDER BY id DESC 이므로 나중에 저장된 데이터가 먼저 나와야 함
        assertEquals(secondId, people.get(0).getId());
        assertEquals("이순신", people.get(0).getName());

        assertEquals(firstId, people.get(1).getId());
        assertEquals("강감찬", people.get(1).getName());
    }

    @Test
    @DisplayName("person 데이터를 수정할 수 있다")
    void update() throws Exception {
        Integer savedId = personDao.insert(
                con,
                Person.builder()
                        .name("홍길동")
                        .build()
        );

        Person updatePerson = Person.builder()
                .id(savedId)
                .name("홍길동_수정")
                .build();

        int result = personDao.update(con, updatePerson);
        Optional<Person> found = personDao.findById(con, savedId);

        assertEquals(1, result);
        assertTrue(found.isPresent());
        assertEquals("홍길동_수정", found.get().getName());
    }

    @Test
    @DisplayName("person 데이터를 삭제할 수 있다")
    void delete() throws Exception {
        Integer savedId = personDao.insert(
                con,
                Person.builder()
                        .name("홍길동")
                        .build()
        );

        int result = personDao.delete(con, savedId);
        Optional<Person> found = personDao.findById(con, savedId);

        assertEquals(1, result);
        assertTrue(found.isEmpty());
    }
}