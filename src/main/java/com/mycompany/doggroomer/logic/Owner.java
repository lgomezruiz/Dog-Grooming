
package com.mycompany.doggroomer.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {
    
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ownerId;
    private String ownerName;
    private String ownerPhone;
    
    //Builders
    public Owner() {
    }

    public Owner(int ownerId, String ownerName, String ownerPhone) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
    }
    
    //Getters & Setters
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }
    
    
}
