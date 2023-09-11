package SDA2.NO1;

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

public class Election  {
    //declar o lista de candidati care va avea 10 pozitii;
    Candidate[] candidates = new Candidate[10];
    // folosesc o variabila  in care voi numara candidatii
    int noOfCandidates = 0;

    //cu ajutorul constructorului intializez lista de candidati
    public Election(Candidate[] candidates) {

        this.candidates = candidates;
    }

    public Election() {

    }
    // metoda vote() va primi ca parametru un String care reprezinta numele unui candidat
    // si va returna adevarat daca candidatul este in lista, in acest caz,
        // va creste si numarul de voturi pentru acel candidat
    // altfel va returna false

    public boolean vote(String name) {
        //parcurg lista de candidati si daca numele dat ca parametru in metoda este egal
        // cu numele unui candidat din lista atunci crestem numarul de voturi corepunzator numelui candidatului gasit
        // si returnam true
        for (int i = 0; i < noOfCandidates; ++i) {
            if (name.equals(candidates[i].name)) {
                ++(candidates[i].numberOfVotes);
             return true;
            }
        }
        return false;
    }
    //metoda nu primeste nici un parametru dar va returna numele unui candidat  cu cele mai multe voturi
    //daca sunt mai multi candidati cu numar egal de voturi atunci se va afisa pe linie noua fiecare nume de candidat
    public String[] declareWinner() {
        int maxNoOfVotes = 0;// decla o var in care voi stoca nr maxim de voturi//
        String[] names = new String[10];// decla un sir de stringuri in care voi pune numele candidatilor daca au voturi egale
        int position = 0;//indexul de pozitie al noului sir de stringuri
        for (int i = 0; i < noOfCandidates; i++) { // parcurg lista de candidati
            if (maxNoOfVotes < candidates[i].numberOfVotes) { // verific daca nr de voturi este mai mare decat val max declarata
                maxNoOfVotes = candidates[i].numberOfVotes;// var va lua valoarea nr de voturi
                names[position] = candidates[i].name;//adaug in sir numele candidatului si il suprascriu de fiecare data cand am un nou maxim de voturi
            }  else if (maxNoOfVotes == candidates[i].numberOfVotes ) { // daca val max a gasit o valoare egala cu nr de voturi
                maxNoOfVotes = candidates[i].numberOfVotes;// suprascriu valoarea maxima pentru a merge mai departe
                names[++position] = candidates[i].name;// cresc pozitia in sirul de nume si adaug numele pe acea pozitie
            }
        }
        return names;//returnez sirul de nume care au numar egal de voturi
    }


}
