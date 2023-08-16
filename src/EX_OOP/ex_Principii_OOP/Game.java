package EX_OOP.ex_Principii_OOP;

public class Game {
    public static void main(String[] args) {
//        PlayerCharacter playerCharacter = new PlayerCharacter();
//        playerCharacter.speak();
//        System.out.println(playerCharacter.getName());
//        playerCharacter.setAge(34);
//        System.out.println(playerCharacter.getAge());
        Archer archer = new Archer("John", 25, 50);
        System.out.println(archer.getName());
        System.out.println(archer instanceof PlayerCharacter);
        System.out.println(archer instanceof Archer);
        PlayerCharacter wizard = new Wizard("Gandal", 28, 100);
        wizard.attack();
        wizard = new Archer("Legolos", 10, 20);
        wizard.attack();
        doAllPlayerActions(wizard);
        doAllPlayerActions(archer);

    }
    public static void doAllPlayerActions(PlayerCharacter playerCharacter) {
        playerCharacter.speak();
        playerCharacter.attack();
        playerCharacter.run();
    }
}
