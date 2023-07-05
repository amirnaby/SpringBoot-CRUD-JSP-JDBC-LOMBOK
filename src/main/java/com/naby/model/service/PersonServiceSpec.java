package com.naby.model.service;

import com.naby.model.domain.Person;

import java.util.List;

public interface PersonServiceSpec {
    void save(Person person);
    void update(Person person);
    void delete(Person person);
    Person findOne(Person person);
    List<Person> findAll();
}