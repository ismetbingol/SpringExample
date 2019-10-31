package com.addressbook.demo.repo;

import com.addressbook.demo.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationRepository extends JpaRepository<Person,Integer> {

}
