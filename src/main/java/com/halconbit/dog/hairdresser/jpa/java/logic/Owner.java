package com.halconbit.dog.hairdresser.jpa.java.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Brayan Esteves
 */
@Entity
public class Owner implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int    owner_id;
    private String name;
    private String cellphone_number;
    private String address;

    public Owner() {
    }

    public Owner(int owner_id, String name, String cellphone_number, String address) {
        this.owner_id         = owner_id;
        this.name             = name;
        this.cellphone_number = cellphone_number;
        this.address          = address;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone_number() {
        return cellphone_number;
    }

    public void setCellphone_number(String cellphone_number) {
        this.cellphone_number = cellphone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
