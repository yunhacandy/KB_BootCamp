package com.example.jdbc.service;

import com.example.jdbc.common.TransactionManager;
import com.example.jdbc.dao.PersonDao;
import com.example.jdbc.domain.Person;

import java.util.List;
import java.util.Optional;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Integer save(String name) throws Exception {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }
        return TransactionManager.execute(
                con -> personDao.insert(con, Person.builder().name(name).build())
        );
    }

    public Optional<Person> findById(Integer id) throws Exception {
        return TransactionManager.execute(
                con -> personDao.findById(con, id)
        );
    }

    public List<Person> findAll() throws Exception {
        return TransactionManager.execute(personDao::findAll);
    }

    public int update(Person person) throws Exception {
        if (person.getId() == null) {
            throw new IllegalArgumentException("수정하려면 id는 필수입니다.");
        }

        return TransactionManager.execute(
                con -> personDao.update(con, person)
        );
    }

    public int delete(Integer id) throws Exception {
        return TransactionManager.execute(
                con -> personDao.delete(con, id)
        );
    }
}
