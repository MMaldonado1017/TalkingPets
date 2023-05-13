import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have? ");
        int numPets = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Pet> petList = new ArrayList<>();

        for (int i = 0; i < numPets; i++) {
            System.out.print("Enter the kind of pet #" + (i + 1) + ": ");
            String kind = scanner.nextLine();
            System.out.print("Enter the name of pet #" + (i + 1) + ": ");
            String name = scanner.nextLine();

            Pet pet;
            switch (kind.toLowerCase()) {
                case "dog":
                    pet = new Dog(name);
                    break;
                case "cat":
                    pet = new Cat(name);
                    break;
                case "bird":
                    pet = new Birds(name);
                    break;
                default:
                    pet = new Pet(name);
                    break;
            }

            petList.add(pet);
        }

        System.out.println("\nYour pet list:");
        for (Pet pet : petList) {
            System.out.println(pet.getName() + ":");
            pet.speak();
        }
    }
}
