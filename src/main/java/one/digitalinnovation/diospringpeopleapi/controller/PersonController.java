package one.digitalinnovation.diospringpeopleapi.controller;

import one.digitalinnovation.diospringpeopleapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.diospringpeopleapi.entity.Person;
import one.digitalinnovation.diospringpeopleapi.repository.PersonRepository;
import one.digitalinnovation.diospringpeopleapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

}
