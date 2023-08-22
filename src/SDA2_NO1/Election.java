package SDA2_NO1;

import java.util.*;
//### Clasa Election
//
//Va avea o lista de candidati si urmatoarele functionalitati:
//
//### Funcția vote
//
//Creeaza funcția `vote` care:
//
//- Primește un singur argument, `name`, reprezentând numele candidatului pentru care s-a votat.
//- Dacă `name` corespunde cu numele unui candidat, actualizează totalul de voturi al candidatului.
//    - Funcția ar trebui să returneze `true` pentru un vot valid.
//- Dacă `name` nu corespunde, funcția returnează `false`, indicând un vot invalid.
//
//> Notă: Poți presupune că nu există doi candidați cu același nume.
//>
//
//### Funcția declareWinner
//
//Completează funcția `declareWinner`:
//
//- Afișează numele candidatului cu cele mai multe voturi.
//- Dacă există un egalitate, afișează numele fiecărui candidat câștigător, fiecare pe o linie nouă.
//
//### Exemplu, pentru 3 candidati: Alice, Bob si Charlie:

public class Election extends Candidate {
    String[] candidates = new String[10];

    public Election(String name, String[] candidates) {
        super(name);
        this.candidates = candidates;
    }
     public boolean findName(String name) {
        boolean flag = false;
        for (int i = 0; i < candidates.length ; i++) {
            if (name.equals(candidates[i])) {
                flag = true;
            }
        }
        return flag;
    }
    public boolean vote(String name) {
        if (findName(name)) {
            this.getNumberoOfVotes();
        }
        return true;
    }

   public String declareWinner(String [] name) {
        int maxNoOfVotes = 10;
        String winnerName;
        //parcurg lista de nume si verific pentru fiecare nume care este numarl maxim de voturi



        return null;
    }
}
