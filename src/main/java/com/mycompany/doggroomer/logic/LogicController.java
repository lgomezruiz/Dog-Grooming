
package com.mycompany.doggroomer.logic;

import com.mycompany.doggroomer.persistence.PersistenceController;
import java.util.List;

public class LogicController {
    
    //Instance PersistenceController
    PersistenceController persistenceController = new PersistenceController();

    //Method to save Interface data
    public void save(String ownerName, String ownerPhone, String petName, 
            String petBreed, String petColor, String petObservations, 
            String allergic, String specialAttention) {
        
        //We create the owner and assign the values
        Owner owner = new Owner();
        owner.setOwnerName(ownerName);
        owner.setOwnerPhone(ownerPhone);
        
        //We create the pet and assign the values
        Pet pet = new Pet();
        pet.setPetName(petName);
        pet.setPetBreed(petBreed);
        pet.setPetColor(petColor);
        pet.setPetAllergic(allergic);
        pet.setPetSpecialAttention(specialAttention);
        pet.setPetObservations(petObservations);
        pet.setOwner(owner);
        
        //Save data to the persistence controller
        persistenceController.save(owner, pet);
    }

    public List<Pet> getPets() {
        
        return persistenceController.getPets();
    }

    public void deletePet(int petId) {
        persistenceController.deletePet(petId);
    }

    public Pet getPets(int petId) {
        return persistenceController.getPets(petId);
    }

    public void editPet(Pet pet, String petName, String petBreed, String petColor, String allergic, String specialAttention, String petObservations, String ownerName, String ownerPhone) {
        
        //Set edit data
        pet.setPetName(petName);
        pet.setPetBreed(petBreed);
        pet.setPetColor(petColor);
        pet.setPetAllergic(allergic);
        pet.setPetSpecialAttention(specialAttention);
        pet.setPetObservations(petObservations);
        
        //Set edit data at DB
        persistenceController.editPet(pet);
        
        //Set edit data
        Owner owner = this.searchOwner(pet.getOwner().getOwnerId());
        owner.setOwnerName(ownerName);
        owner.setOwnerPhone(ownerPhone);
        
        //Set edit data at DB
        this.editOwner(owner);
    }

    private Owner searchOwner(int ownerId) {
        return persistenceController.getOwner(ownerId);
    }

    private void editOwner(Owner owner) {
        persistenceController.editOwner(owner);
    }

    
}
