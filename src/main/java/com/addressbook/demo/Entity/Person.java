package com.addressbook.demo.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private List<Communication> communicationList;

    public Person() {
    }

    @NotBlank
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

    public List<Communication> getCommunications() {
        return communicationList;
    }


    public void setCommunications(ArrayList<Communication> communicationList) {
        this.communicationList = communicationList;
    }
}