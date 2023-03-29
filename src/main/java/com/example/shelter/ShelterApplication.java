package com.example.shelter;

import enums.Other;
import handlers.AnimalHandlerImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repositories.Animal;

@SpringBootApplication
public class ShelterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShelterApplication.class, args);
        AnimalHandlerImpl  animalHandler = new AnimalHandlerImpl();
        String[] array = new String[3];
        array[0] = Other.castrated.getTitle();
        array[1] = Other.serilized.getTitle();
        array[2] = Other.vaccinated.getTitle();

        Animal animal = new Animal("andrey" ,18,"dog","sychka","medium",array);
        animalHandler.addAnimal(animal);
    }
}
