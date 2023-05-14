package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();

        System.out.print("How many pets do you have? ");
        int numPets = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numPets; i++) {
            System.out.print("Enter the type of pet (Dog, Cat, Monkey, etc.): ");
            String petType = scanner.nextLine();
            System.out.print("Enter the name of the pet: ");
            String petName = scanner.nextLine();

            Pet pet = createPet(petType, petName);
            if (pet != null) {
                pets.add(pet);
            }
        }

        System.out.println("\nList of pets:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " says: " + pet.speak());
        }
    }

    private static Pet createPet(String petType, String petName) {
        switch (petType.toLowerCase()) {
            case "dog":
                return new Dog(petName);
            case "cat":
                return new Cat(petName);
            case "monkey":
                return new Monkey(petName);
            default:
                System.out.println("Unknown pet type: " + petType);
                return null;
        }
    }
}
