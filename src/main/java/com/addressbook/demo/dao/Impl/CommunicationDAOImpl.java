package com.addressbook.demo.dao.Impl;

import com.addressbook.demo.Entity.Person;
import com.addressbook.demo.dao.CommunicationDAO;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CommunicationDAOImpl implements CommunicationDAO {
    @Override
    public List<Person> getAllPerson() {
        return null;
    }
}
