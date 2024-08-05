package ir.rahgozin.web.controller;

import com.github.javafaker.Faker;
import ir.rahgozin.web.entity.Person;
import ir.rahgozin.web.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService service;
    private final Faker faker = new Faker();

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/person")
    public Person findRandomPerson() {
        String randomFirstname = faker.name().firstName();
        return service.findTopByFirstname(randomFirstname);
    }
}
