package com.addressbook.demo.repo;

import com.addressbook.demo.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRepository extends JpaRepository<Person,Integer> {

}
