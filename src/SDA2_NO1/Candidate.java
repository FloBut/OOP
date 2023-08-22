package SDA2_NO1;
// Ar trebui să creezi o clasă numită `Candidate` care să aibă următoarele proprietăți:
//
//- `name` - Numele candidatului
//- `numberOfVotes` - Totalul voturilor primite de candidat
public class Candidate {
    String name;
    private int numberoOfVotes;

    public Candidate(String name) {
        this.name = name;
        this.numberoOfVotes = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberoOfVotes() {
        return numberoOfVotes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberoOfVotes(int numberoOfVotes) {
        this.numberoOfVotes = numberoOfVotes;
    }
}
