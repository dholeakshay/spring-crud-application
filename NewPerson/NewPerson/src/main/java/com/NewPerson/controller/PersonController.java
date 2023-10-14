package com.NewPerson.controller;

import com.NewPerson.entity.Person;
import com.NewPerson.impl.PersonImpl;
import com.NewPerson.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonImpl personImpl;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String savePerson(@RequestBody Person person){
     personService.savePerson(person);
        return "saved";
    }


    @RequestMapping (value= "/updatePan/{pan}" , method = RequestMethod.PUT)
    public Integer  updatePersonNew(@PathVariable ("pan") Integer pan,   @RequestBody Person person){
    Person person1 = personService.updatePerson(pan);
    person1.setFirstName(person.getFirstName());
    person1.setLastName(person.getLastName());
    person1.setMob(person.getMob());
    person1.setEmail(person.getEmail());
    Integer integer = personService.savePerson1(person1);
        return integer;
    }





    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public List<Person > getPerson(){
        List<Person> getAll = personImpl.getAll();
        return getAll;

    }

    @RequestMapping (value ="/del/{pan}",method = RequestMethod.DELETE)
    public ResponseEntity<Person>  deletePer(@PathVariable ("pan") Integer pan){
        personService.deletePerson(pan);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
