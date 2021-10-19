package one.digitalinnovation.diospringpeopleapi.repository;

import one.digitalinnovation.diospringpeopleapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
