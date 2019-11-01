package com.addressbook.demo.service;

import com.addressbook.demo.Entity.Communication;
import com.addressbook.demo.Entity.Person;

import java.util.List;
import java.util.Optional;

public interface CommunicationService {

    List<Person> getAllPerson();

    Optional<Person> getPersonCommunicationAddress(int id);

    void update(int personId, Communication communication);

    void deletePerson(Integer id) ;
}
