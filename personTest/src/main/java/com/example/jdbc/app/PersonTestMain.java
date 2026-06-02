package com.example.jdbc.app;

import com.example.jdbc.dao.PersonDao;
import com.example.jdbc.service.PersonService;

public class PersonTestMain {
    public static void main(String[] args) throws Exception {
        PersonService personService = new PersonService(new PersonDao());

        Integer personId = personService.save("박윤하");
        System.out.println("저장된 person id = " + personId);

        personService.findAll().forEach(System.out::println);
    }
}
