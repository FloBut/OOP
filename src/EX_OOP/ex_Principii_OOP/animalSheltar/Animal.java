package EX_OOP.ex_Principii_OOP.animalSheltar;

public abstract class Animal {

    private String name;

    public Animal(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
    public abstract void greeting();
}
