package EX_OOP.ex6_luptatori;

public class Game {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("first", 25, 10);
        Fighter fighter2 = new Fighter("second", 50, 15);
        System.out.println(declareWinner(fighter1, fighter2, "fighter1"));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttackerName) {
        //stabilim cine ataca primul: fighter1 sau fighter2
        //verific daca firstAttacker este acelasi cu numele fighter1
        // daca nu este
        //atat tmp cat viata ambilor jucatori este mai mare ca 0 > jocJocul();
        // jocJocul:
        // atac - scade viata celui de-al doilea damege - ul primului atacator
        // daca viata celui de-al doilea este mai mica sau egala cu 0, returnez numele primului atacator

        // atac - scade viata primului damage-ul celui de-al doilea
        // daca viata celui de-al doilea este mai mica sau egala cu 0, returnez numele celui de-al doilea atacator
        Fighter firstAttacker = new Fighter();
        Fighter secondAttacker = new Fighter();
        if (firstAttackerName.equals(fighter1.name)) {
            firstAttacker = fighter1;
            secondAttacker = fighter2;
        } else {
            firstAttacker = fighter2;
            secondAttacker = fighter1;
        }
        while (firstAttacker.health > 0 && secondAttacker.health > 0) {
            secondAttacker.health -= firstAttacker.health;
            if (secondAttacker.health <= 0) {
                return firstAttacker.name.toString();
            }
            firstAttacker.health -= secondAttacker.health;
            if (firstAttacker.health <= 0) {
                return secondAttacker.name.toString();
            }
        }
        return "";
    }
}
