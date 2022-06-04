package com.windclass.demo.pojo;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String name;

    @Column(name = "password")
    private String password;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
