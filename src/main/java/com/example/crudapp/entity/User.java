package com.example.crudapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    private Integer Age;
    private String Phone;

    public User() {}

    public User(String name, String email, Integer Age, String Phone ) {
        this.name = name;
        this.email = email;
        this.Age = Age;
        this.Phone = Phone;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return Age; }
    public void setAge(Integer Age) { this.Age = Age; }

    public String getPhone() { return Phone; }
    public void setPhone(String Phone) { this.Phone = Phone; }
}
