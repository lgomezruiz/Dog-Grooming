
package com.mycompany.doggroomer.persistence;

import com.mycompany.doggroomer.logic.Owner;
import com.mycompany.doggroomer.logic.Pet;
import com.mycompany.doggroomer.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    //Persistence Instances
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        
        //Create in the owner's DB
        ownerJpa.create(owner);
        
        //Create in the pet's DB
        petJpa.create(pet);
        
    }

    public List<Pet> getPets() {
        
        return petJpa.findPetEntities();
    }

    public void deletePet(int petId) {
        try {
            petJpa.destroy(petId);
            
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pet getPets(int petId) {
        return petJpa.findPet(petId);
    }

    public void editPet(Pet pet) {
        try {
            petJpa.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner getOwner(int ownerId) {
        return ownerJpa.findOwner(ownerId);
    }

    public void editOwner(Owner owner) {
        try {
            ownerJpa.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
