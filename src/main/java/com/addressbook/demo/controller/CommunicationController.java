package com.addressbook.demo.controller;

import com.addressbook.demo.Entity.Person;
import com.addressbook.demo.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class CommunicationController {
    @Autowired
    CommunicationService communicationService;

    @GetMapping
    public ResponseEntity<List<Person>>getAllStudent(){

        List<Person> list=communicationService.getAllPerson();
        return new ResponseEntity<List<Person>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
