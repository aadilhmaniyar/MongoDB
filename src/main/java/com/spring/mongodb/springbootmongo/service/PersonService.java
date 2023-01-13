package com.spring.mongodb.springbootmongo.service;

import com.spring.mongodb.springbootmongo.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);
    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getByPersonAge(Integer minAge, Integer maxAge);
}
