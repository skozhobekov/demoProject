package com.swagger.demoProject.Services;

import com.swagger.demoProject.models.Person;

import java.util.List;

public interface PersonService {

    void savePerson(Person person);

    Person getPerson();

    List<Person> getPersonList();



}
