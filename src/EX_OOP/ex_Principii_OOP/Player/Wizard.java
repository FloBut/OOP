package EX_OOP.ex_Principii_OOP.Player;

public class Wizard extends PlayerCharacter {
    private int power;

    public Wizard(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public int getPower() {

        return power;
    }
    public void setPower(int power) {

        this.power = power;
    }
    public void attack () {
        System.out.println("Attacking with a power of " + this.power);
    }

}
