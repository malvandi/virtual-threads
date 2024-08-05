package ir.rahgozin.web.service;

import ir.rahgozin.web.entity.Person;
import ir.rahgozin.web.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Person findTopByFirstname(String firstname) {
        Person person = repository.findTopByFirstName(firstname);
        return repository.findTopByFirstName(firstname);
    }
}
