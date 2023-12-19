
package com.mycompany.doggroomer.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int petId;
    private String petName;
    private String petBreed;
    private String petColor;
    private String petAllergic;
    private String petSpecialAttention;
    private String petObservations;
    
    @OneToOne
    private Owner owner;
    
    //Builders
    public Pet() {
    }

    public Pet(int petId, String petName, String petBreed, String petColor, String petAllergic, String petSpecialAttention, String petObservations, Owner owner) {
        this.petId = petId;
        this.petName = petName;
        this.petBreed = petBreed;
        this.petColor = petColor;
        this.petAllergic = petAllergic;
        this.petSpecialAttention = petSpecialAttention;
        this.petObservations = petObservations;
        this.owner = owner;
    }
    
    //Getters & Setters
    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPetColor() {
        return petColor;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public String getPetAllergic() {
        return petAllergic;
    }

    public void setPetAllergic(String petAllergic) {
        this.petAllergic = petAllergic;
    }

    public String getPetSpecialAttention() {
        return petSpecialAttention;
    }

    public void setPetSpecialAttention(String petSpecialAttention) {
        this.petSpecialAttention = petSpecialAttention;
    }

    public String getPetObservations() {
        return petObservations;
    }

    public void setPetObservations(String petObservations) {
        this.petObservations = petObservations;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
}
