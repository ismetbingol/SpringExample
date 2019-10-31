package com.addressbook.demo.pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @Column(name="full_name")
    private String fullName;

    @Column(name="birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "person")
    private ArrayList<Communication> communicationList;

    public Person() {
    }

    public Person(int id, String fullName, Date birthDate) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void addCommunication(Communication communication){

        communicationList.add(communication);
    }

    public ArrayList<Communication> getCommunications() {
        return communicationList;
    }


    public void setCommunications(ArrayList<Communication> communicationList) {
        this.communicationList = communicationList;
    }
}