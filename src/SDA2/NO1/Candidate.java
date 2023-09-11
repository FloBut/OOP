package SDA2.NO1;
// Ar trebui să creezi o clasă numită `Candidate` care să aibă următoarele proprietăți:
//
//- `name` - Numele candidatului
//- `numberOfVotes` - Totalul voturilor primite de candidat
public class Candidate {
    String name;
    int numberOfVotes;

    public Candidate(String name, int numberOfVotes) {
        this.name = name;
        this.numberOfVotes = 0;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
