package com.swagger.demoProject.Controllers;


import com.swagger.demoProject.Services.PersonService;
import com.swagger.demoProject.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private PersonService personService;


    @RequestMapping(name = "/getuser", method = RequestMethod.GET)
    public Person getPerson() {
      return personService.getPerson();
    }

    @RequestMapping(name = "/saveUser", method = RequestMethod.POST)
    public ResponseEntity<?> savePerson (@RequestBody Person person) {
        personService.savePerson(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @RequestMapping(name = "/getpersons", method = RequestMethod.GET)
    public ResponseEntity<?> getPersonList() {
        return new ResponseEntity<>(personService.getPersonList(), HttpStatus.OK);
    }
}
