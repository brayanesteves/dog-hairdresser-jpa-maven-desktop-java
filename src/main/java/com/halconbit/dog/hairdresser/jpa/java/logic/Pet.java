package com.halconbit.dog.hairdresser.jpa.java.logic;

/**
 *
 * @author Brayan Esteves
 */
public class Pet {
    
    private int    customer_number;
    private String dog_name;
    private String breed;
    private String color;
    private String allergic;
    private String special_care;
    private String observations;
    
    // Ratio 1:1
    private Owner  owner;

    public Pet() {
    }

    public Pet(int customer_number, String dog_name, String breed, String color, String allergic, String special_care, String observations, Owner owner) {
        this.customer_number = customer_number;
        this.dog_name        = dog_name;
        this.breed           = breed;
        this.color           = color;
        this.allergic        = allergic;
        this.special_care    = special_care;
        this.observations    = observations;
        // Ratio 1:1
        this.owner           = owner;
    }

    public int getCustomerNumber() {
        return this.customer_number;
    }

    public void setCustomerNumber(int customer_number) {
        this.customer_number = customer_number;
    }

    public String getDogName() {
        return this.dog_name;
    }

    public void setDogName(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return this.allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecial_care() {
        return this.special_care;
    }

    public void setSpecialCare(String special_care) {
        this.special_care = special_care;
    }

    public String getObservations() {
        return this.observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
    
}
