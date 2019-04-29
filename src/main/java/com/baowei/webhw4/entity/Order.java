package com.baowei.webhw4.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_num")
    private int num;

    @Column(name = "order_user")
    private String username;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "order_time")
    private Timestamp time;

    public Order() {
        super();
    }

    public Order(String username, Timestamp time) {
        super();
        this.username = username;
        this.time = time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
