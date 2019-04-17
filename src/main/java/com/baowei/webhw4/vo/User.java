package com.baowei.webhw4.vo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_kind")
    private String kind;

    @Column(name = "user_status")
    private Boolean status;

    public User() {
        super();
    }

    public User(int id, String name, String password, String email, String kind, Boolean status) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.kind = kind;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
