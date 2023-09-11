package EX_OOP.ex6_luptatori;

public class Game {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("f1", 100, 10);
        Fighter fighter2 = new Fighter("f2", 100, 50);
        System.out.println(declareWinner(fighter1,fighter2, "f1"));

    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttackerName) {
        // stabilim cine ataca primul
        // daca firstAttackerName este egal cu numele primului atacator atunci retin numele primului atatcator intr- o var
            // ltfel retin in variabila numele celui de-al doilea atacator
        // atat timp cat viata ambilor jucatori este mai mare ca 0, joc jocul
            // scadem din viata celui de-al doilea damege- ul care il da primul
            // daca viata lui al doilea este mai mica sau egala cu 0 returnez numele primului
            // scadem din viata primului damege-ul care il da al doilea
            // daca viata lui primului este mai mica sau egala cu 0 returnez numele celui de al doilea

        Fighter firstAttacker = firstAttackerName.equals(fighter1.name)? fighter1: fighter2;
        Fighter secondAttacker = firstAttackerName.equals(fighter2.name)? fighter2:fighter1;
//        if (firstAttackerName.equals(fighter1.name)) {
//            firstAttacker = fighter1;
//            secondAttacker = fighter2;
//        } else {
//            firstAttacker = fighter2;
//            secondAttacker = fighter1;
//        }

        while (firstAttacker.health > 0 && secondAttacker.health > 0) {
            secondAttacker.health -= firstAttacker.damagePerAttack;
            if (secondAttacker. health == 0) {
                return firstAttacker.name;
            }
            firstAttacker.health -= secondAttacker.damagePerAttack;
            if (firstAttacker.health == 0) {
                return secondAttacker.name;
            }
        }
        return null;
    }

}
