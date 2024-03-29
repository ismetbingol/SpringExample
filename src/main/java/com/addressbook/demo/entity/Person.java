package com.addressbook.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_date", columnDefinition = "DATETIME")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name="id")
    @OneToMany(mappedBy = "person", targetEntity = Communication.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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

    public void addCommunication(Communication communication) {

        communicationList.add(communication);
    }

    public List<Communication> getCommunications() {
        return communicationList;
    }


    public void setCommunications(ArrayList<Communication> communicationList) {
        this.communicationList = communicationList;
    }
}