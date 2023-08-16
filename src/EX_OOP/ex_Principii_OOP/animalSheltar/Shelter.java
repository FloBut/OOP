package EX_OOP.ex_Principii_OOP.animalSheltar;

public class Shelter {
    private Animal[] animals;
    private int numberOfAnimals;


    public Shelter(int size) {
        this.animals = new Animal[size];
        numberOfAnimals = 0;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void makeNoise(){///toate animalele sa salute
        for (int i = 0; i <numberOfAnimals; ++i) {
            animals[i].greeting();
        }
    }
    public void addAnimal (Animal animal) {
        animals[numberOfAnimals++] = animal;
    }
}
