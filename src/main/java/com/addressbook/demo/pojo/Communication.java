package com.addressbook.demo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Communication")
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="person_id")
    private int personId;

    @Column(name="communication_Type")
    private CommunicationType communicationType;

    @Column(name="address_value")
    private String value;

    public Communication() {
    }

    public Communication(int id, int personId, CommunicationType communicationType, String value) {
        this.id = id;
        this.personId = personId;
        this.communicationType = communicationType;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(CommunicationType communicationType) {
        this.communicationType = communicationType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
