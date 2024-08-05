package ir.rahgozin.web.repository;

import ir.rahgozin.web.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
    Person findTopByFirstName(String firstname);
}
