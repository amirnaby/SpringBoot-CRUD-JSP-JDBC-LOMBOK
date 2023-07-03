package com.naby.service;

import com.naby.repository.Crud;
import com.naby.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private Crud<Person, Long> personCrud;

    @Transactional
    public void save(Person person) {
        personCrud.save(person);
    }

    @Transactional
    public void update(Person person) {
        personCrud.update(person);
    }

    @Transactional
    public void delete(Person person) {
        personCrud.delete(person);
    }

    public Person findOne(Person person) {
        return personCrud.findOne(Person.class, person.getId());
    }

    public List<Person> findAll() {
        return personCrud.findAll(Person.class);
    }
}