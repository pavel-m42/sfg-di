package com.springframework.pets;

/**
 * Created by Fhoenix on 2021/03/08.
 */
public class PetServiceFactory {

    public PetService getPerService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
