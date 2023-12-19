package com.mycompany.doggroomer.logic;

import com.mycompany.doggroomer.logic.Owner;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-19T21:39:27", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pet.class)
public class Pet_ { 

    public static volatile SingularAttribute<Pet, String> petName;
    public static volatile SingularAttribute<Pet, Owner> owner;
    public static volatile SingularAttribute<Pet, Integer> petId;
    public static volatile SingularAttribute<Pet, String> petSpecialAttention;
    public static volatile SingularAttribute<Pet, String> petAllergic;
    public static volatile SingularAttribute<Pet, String> petBreed;
    public static volatile SingularAttribute<Pet, String> petColor;
    public static volatile SingularAttribute<Pet, String> petObservations;

}