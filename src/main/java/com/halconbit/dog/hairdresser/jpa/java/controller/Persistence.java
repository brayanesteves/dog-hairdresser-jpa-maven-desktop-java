package com.halconbit.dog.hairdresser.jpa.java.controller;

import com.halconbit.dog.hairdresser.jpa.java.logic.Owner;
import com.halconbit.dog.hairdresser.jpa.java.logic.Pet;
import com.halconbit.dog.hairdresser.jpa.java.persistence.OwnerJpaController;
import com.halconbit.dog.hairdresser.jpa.java.persistence.PetJpaController;

/**
 *
 * @author Brayan Esteves
 */
public class Persistence {
    
    OwnerJpaController ownerJpaController = new OwnerJpaController();
    PetJpaController   petJpaController   = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        
        // Create the <b>"owner"</b> in the database.
        this.ownerJpaController.create(owner);
        // Create the <b>"pet"</b> in the database.
        this.petJpaController.create(pet);
        
    }
    
}
