package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    public Employee() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMP_SEQ")
    private long id;
    private String firstname;
    private String lastName;
    private String email;

    public Employee(long id, String firstname, String lastName, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
