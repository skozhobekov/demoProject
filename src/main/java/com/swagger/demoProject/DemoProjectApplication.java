package com.swagger.demoProject;

import com.swagger.demoProject.models.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.beans.PersistenceDelegate;

@SpringBootApplication
public class DemoProjectApplication {

	Person person = new Person();

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
