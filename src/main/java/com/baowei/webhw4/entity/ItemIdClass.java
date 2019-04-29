package com.baowei.webhw4.entity;

import java.io.Serializable;

public class ItemIdClass implements Serializable {
    private int ordernum;
    private String itemisbn;

    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }

    public String getItemisbn() {
        return itemisbn;
    }

    public void setItemisbn(String itemisbn) {
        this.itemisbn = itemisbn;
    }
}
