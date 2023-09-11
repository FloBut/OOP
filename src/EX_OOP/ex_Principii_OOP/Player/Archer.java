package EX_OOP.ex_Principii_OOP.Player;

public class Archer extends PlayerCharacter {
    private int numberOfArrows;

    public Archer(String name, int age, int numberOfArrows) {
        super(name, age);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public void attack () {
        this.numberOfArrows--;
        System.out.println("Attacking with arrow. Number of arrow left: " + this.numberOfArrows);
    }
}
