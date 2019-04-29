package com.baowei.webhw4.entity;

import javax.persistence.*;

@Entity
@Table(name="order_item")
@IdClass(com.baowei.webhw4.entity.ItemIdClass.class)
public class OrderItem {

    @Id
    @Column(name = "item_ordernum")
    private int ordernum;

    @Column(name = "item_name")
    private String itemname;

    @Id
    @Column(name = "item_isbn")
    private String itemisbn;

    @Column(name = "item_amount")
    private int itemamount;

    public OrderItem() {
        super();
    }

    public OrderItem(int ordernum, String itemname, String itemisbn, int itemamount) {
        super();
        this.ordernum = ordernum;
        this.itemname = itemname;
        this.itemisbn = itemisbn;
        this.itemamount = itemamount;
    }

    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemisbn() {
        return itemisbn;
    }

    public void setItemisbn(String itemisbn) {
        this.itemisbn = itemisbn;
    }

    public int getItemamount() {
        return itemamount;
    }

    public void setItemamount(int itemamount) {
        this.itemamount = itemamount;
    }
}


