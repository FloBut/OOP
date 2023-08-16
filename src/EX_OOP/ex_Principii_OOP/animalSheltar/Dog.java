package EX_OOP.ex_Principii_OOP.animalSheltar;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void greeting() {
        System.out.println(this.getName() + "oof");

    }
    public void greeting(Dog anotherDog) {
        System.out.println(this.getName() + "woffff");
    }

}
