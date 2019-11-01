package com.addressbook.demo.controller;

import com.addressbook.demo.Entity.Person;
import com.addressbook.demo.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class CommunicationController {
    @Autowired
    CommunicationService communicationService;

    @GetMapping
    public ResponseEntity<List<Person>> getAllPerson() {

        List<Person> list = communicationService.getAllPerson();
        return new ResponseEntity<List<Person>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("getPerson/{id}")
    public ResponseEntity<Optional<Person>> getPerson(@PathVariable("id") Integer id) {
        Optional<Person> person = communicationService.getPersonCommunicationAddress(id);
        return new ResponseEntity<Optional<Person>>(person, HttpStatus.OK);
    }

    @DeleteMapping("deletePerson/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable("id") Integer id) {

            communicationService.deletePerson(id);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
