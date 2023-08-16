package EX_OOP.ex_Principii_OOP.animalSheltar;

public class Cat extends Animal {
    private String bread;
    public Cat(String name, String bread) {
        super(name); //mosteneste atributele super clasei
        this.bread = bread;
    }
    public void greating() {
        System.out.println("M");
    }

    public void greeting() {
        System.out.println(this.getName());
    }
}
