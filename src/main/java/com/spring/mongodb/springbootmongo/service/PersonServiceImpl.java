package com.spring.mongodb.springbootmongo.service;

import com.spring.mongodb.springbootmongo.collection.Person;
import com.spring.mongodb.springbootmongo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person){
        return personRepository.save(person).getPersonId();

    }
    @Override
    public List<Person> getPersonStartWith(String name){
        return personRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public void delete(String id){
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
        return personRepository.findPersonByAgeBetween(minAge, maxAge);
    }


}
