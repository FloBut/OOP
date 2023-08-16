package EX_OOP.ex_Principii_OOP.animalSheltar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Animal cat = new Cat("PISI", "de casa");
        cat.greeting();
        Animal dog = new Dog("azor");
        dog.greeting();;
        Animal securityDog = new SecurityDog("politia");
        securityDog.greeting();


        Dog copyDog = (Dog) dog; // cast
        SecurityDog copysECURITY = (SecurityDog) securityDog;
        copyDog.greeting(copysECURITY);

//        Animal animal = getAnimal();
//        animal.greeting();


        Shelter shelter = new Shelter(10);
        shelter.addAnimal(getAnimal());
        System.out.println(Arrays.toString(shelter.getAnimals()));
        shelter.addAnimal(getAnimal());
        System.out.println(Arrays.toString(shelter.getAnimals()));
        shelter.addAnimal(getAnimal());
        shelter.makeNoise();
    }
    public static Animal getAnimal() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch(option
        ){
            case 1:
                return new Cat("pisi", "de casa");
            case 2:
                return new Dog("AZOR");
            case 3:
                return new SecurityDog ("politia");
            default:
                    return null;

        }
    }
}
