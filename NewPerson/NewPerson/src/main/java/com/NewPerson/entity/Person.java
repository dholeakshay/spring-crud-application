package com.NewPerson.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Person_Table")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PanColumn")
    private int pan;
    private long mob;
    private String firstName;
    private String lastName;
    private  String email;

    public Person(){}

    public Person(int pan, long mob, String firstName, String lastName, String email) {
        this.pan = pan;
        this.mob = mob;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
