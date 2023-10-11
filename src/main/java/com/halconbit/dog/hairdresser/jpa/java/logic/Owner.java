package com.halconbit.dog.hairdresser.jpa.java.logic;

/**
 *
 * @author Brayan Esteves
 */
public class Owner {
    
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

    public int getOwnerId() {
        return this.owner_id;
    }

    public void setOwnerId(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphoneNumber() {
        return this.cellphone_number;
    }

    public void setCellphoneNumber(String cellphone_number) {
        this.cellphone_number = cellphone_number;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
