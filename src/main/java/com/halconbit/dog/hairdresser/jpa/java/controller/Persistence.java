package com.halconbit.dog.hairdresser.jpa.java.controller;

import com.halconbit.dog.hairdresser.jpa.java.logic.Owner;
import com.halconbit.dog.hairdresser.jpa.java.logic.Pet;
import com.halconbit.dog.hairdresser.jpa.java.persistence.OwnerJpaController;
import com.halconbit.dog.hairdresser.jpa.java.persistence.PetJpaController;
import com.halconbit.dog.hairdresser.jpa.java.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan Esteves
 */
public class Persistence {
    
    private OwnerJpaController ownerJpaController = new OwnerJpaController();
    private PetJpaController   petJpaController   = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        
        // Create the <b>"owner"</b> in the database.
        this.ownerJpaController.create(owner);
        // Create the <b>"pet"</b> in the database.
        this.petJpaController.create(pet);
        
    }

    public List<Pet> fetchingPets() {
        return this.petJpaController.findPetEntities();
    }

    public void deletePet(int customer_number) {
        try {
            this.petJpaController.destroy(customer_number);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pet fetchingPet(int customer_number) {
        return this.petJpaController.findPet(customer_number);
    }

    public void updatePet(Pet pet) {
        try {
            this.petJpaController.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner fetchingOwner(int owner_id) {
        return this.ownerJpaController.findOwner(owner_id);
    }

    public void updateOwner(Owner owner) {
        try {
            this.ownerJpaController.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
