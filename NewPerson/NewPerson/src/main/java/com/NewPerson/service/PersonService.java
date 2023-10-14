package com.NewPerson.service;

import com.NewPerson.entity.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public interface PersonService {

//    Iterable<Person> listAllPerson();

//    Person getByPan(Integer pan);

    public List<Person> getAll();

    Person savePerson(Person person);


    Person updatePerson(Integer  pan );

    Integer savePerson1(Person person);
    void deletePerson(Integer pan);




}
