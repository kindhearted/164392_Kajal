package com.journaldev.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.journaldev.spring.model.Person;

import java.util.List;

public interface PersonRepository<P> extends CrudRepository<Person, Long> {
    List<Person> findByFirstName(String firstName);
}
