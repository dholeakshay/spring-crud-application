package com.NewPerson.impl;

import com.NewPerson.entity.Person;
import com.NewPerson.repo.PersonRepo;
import com.NewPerson.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonImpl implements PersonService {


    @Autowired
    private PersonRepo personRepo;


//    @Override
//    public Iterable<Person> listAllPerson() {
//        return personRepo.findAll();
//    }
//
//    @Override
//    public Person getByPan(Integer pan) {
//        return personRepo.findById(pan).get();
//    }

    @Override
    public List<Person> getAll() {
        List<Person >  personList = personRepo.findAll();
        return personList;
    }

    @Override
    public Person savePerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public void deletePerson(Integer pan) {
        personRepo.deleteById(pan);
    }

    @Override
    public Person updatePerson(Integer pan) {
        return personRepo.findById(pan).get();
    }

    @Override
    public Integer savePerson1(Person person) {
        return personRepo.save(person).getPan();
    }



//    public PersonRepo getPersonRepo() {
//
//    }
}
