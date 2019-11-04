package com.addressbook.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Communication")
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id;

    @Column(name = "person_id")
    @NotNull
    private int personId;

    @Enumerated(EnumType.STRING)
    @Column(name = "communication_type")
    private CommunicationType communicationType;

    @Column(name = "address_value")
    private String value;

    @ManyToOne(optional = false)
    @JoinColumn(name = "person_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Person person;

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

    @Override
    public String toString() {
        return "Communication{" +
                "id=" + id +
                ", personId=" + personId +
                ", communicationType=" + communicationType +
                ", value='" + value + '\'' +
                ", person=" + person +
                '}';
    }

    public void setValue(String value) {
        this.value = value;
    }
}
