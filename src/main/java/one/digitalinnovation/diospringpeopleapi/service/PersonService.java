package one.digitalinnovation.diospringpeopleapi.service;

import one.digitalinnovation.diospringpeopleapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.diospringpeopleapi.entity.Person;
import one.digitalinnovation.diospringpeopleapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person personNew = personRepository.save(person);
        return MessageResponseDTO.builder().message("Created person with ID "+personNew.getId()).build();
    }

}
