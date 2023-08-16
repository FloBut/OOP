package EX_OOP.ex_Principii_OOP.animalSheltar;

public class SecurityDog extends Dog {
    public SecurityDog(String name) {
        super(name);
    }
    public void greeting() {
        System.out.println(this.getName() + " HOWW");
    }

    public void greeting(Dog anotherDog) {
        System.out.println(this.getName() + "face wwwooof");
    }
}
