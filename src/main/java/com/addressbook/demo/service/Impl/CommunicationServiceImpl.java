package com.addressbook.demo.service.Impl;

import com.addressbook.demo.Entity.Communication;
import com.addressbook.demo.Entity.Person;
import com.addressbook.demo.repo.CommunicationRepository;
import com.addressbook.demo.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommunicationServiceImpl implements CommunicationService {

    @Autowired
    CommunicationRepository communicationRepository;


    @Override
    public List<Person> getAllPerson() {
        List<Person> personList = communicationRepository.findAll();
        if (personList.size() > 0) {
            return personList;
        } else {
            return new ArrayList<Person>();
        }

    }

    @Override
    public Optional<Person> getPersonCommunicationAddress(int id) {
        Optional<Person> person = communicationRepository.findById(id);
        return person;
    }

    @Override
    public void update(int personId, Communication communication) {

    }

    @Override
    public void deletePerson(Integer id) {
        if (communicationRepository.existsById(id)) {

            communicationRepository.deleteById(id);
        }
    }

}