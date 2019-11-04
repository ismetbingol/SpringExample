package com.addressbook.demo.service;

import com.addressbook.demo.entity.Communication;
import com.addressbook.demo.entity.Person;

import java.util.List;
import java.util.Optional;

public interface CommunicationService {

    List<Person> getAllPerson();

    Optional<Person> getPersonCommunicationAddress(int id);

    void update(Integer person_id, Communication communication);

    void deletePerson(Integer id);
}
