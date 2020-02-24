package com.swagger.demoProject.Services.impl;

import com.swagger.demoProject.Services.PersonService;
import com.swagger.demoProject.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {

    private List<Person> list = new ArrayList<>();


    @Override
    public void savePerson(Person person) {
        list.add(person);

    }

    @Override
    public Person getPerson() {
        return new Person("Sanjar" , "159");
    }

    @Override
    public List<Person> getPersonList() {
        return list;

    }
}
