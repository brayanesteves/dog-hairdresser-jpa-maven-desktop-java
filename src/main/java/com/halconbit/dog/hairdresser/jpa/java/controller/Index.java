package com.halconbit.dog.hairdresser.jpa.java.controller;

import com.halconbit.dog.hairdresser.jpa.java.logic.Owner;
import com.halconbit.dog.hairdresser.jpa.java.logic.Pet;
import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class Index {
    
    Persistence persistence = new Persistence();

    public void save(String name, String bread, String color, String observations, String ownersName, String ownersPhone, String allergic, String specialAttention) {
        
        // We create the owner and assign their values.
        Owner owner = new Owner();
        owner.setName(ownersName);
        owner.setCellphone_number(ownersPhone);
        
        // We create the pet and assign its values.
        Pet pet = new Pet();
        pet.setDog_name(name);
        pet.setBreed(bread);
        pet.setColor(color);
        pet.setAllergic(allergic);
        pet.setSpecial_care(specialAttention);
        pet.setObservations(observations);
        pet.setOwner(owner);
        
        this.persistence.save(owner, pet);
        
    }

    public List<Pet> fetchingPets() {
        return this.persistence.fetchingPets();
    }

    public void deletePet(int customer_number) {
        this.persistence.deletePet(customer_number);
    }

    public Pet fetchingPet(int customer_number) {
        return this.persistence.fetchingPet(customer_number);
    }

    public void updatePet(Pet pet, String name, String bread, String color, String observations, String ownersName, String ownersPhone, String allergic, String specialAttention) {
        
        pet.setDog_name(name);
        pet.setBreed(bread);
        pet.setColor(color);
        pet.setObservations(observations);
        pet.setSpecial_care(specialAttention);
        pet.setAllergic(allergic);
        
        // Update pet.
        this.persistence.updatePet(pet);
        
        Owner owner = this.fetchingOwner(pet.getOwner().getOwner_id());        
        owner.setName(ownersName);
        owner.setCellphone_number(ownersPhone);
        
        this.updateOwner(owner);
    }

    private Owner fetchingOwner(int owner_id) {
        return this.persistence.fetchingOwner(owner_id);
    }

    private void updateOwner(Owner owner) {
        this.persistence.updateOwner(owner);
    }
    
}
