package EX_OOP.ex_Principii_OOP.interfete;

public class Freelencer implements Developer, Manager{
    private String name;
    private double hourlyRate;

    public Freelencer(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void implementsFeatures() {
        System.out.println("Implement features as a freelencer");
    }

    @Override
    public void implemntFeatures() {

    }

    public void solveBugs() {
        System.out.println("Solve bugs as a freelencer");
    }
    public void writeDocumentation() {
        System.out.println("Write documentation as a freelancer");
    }

    @Override
    public void evaluatePeople() {

    }
    @Override
    public void delgateTasks() {

    }
}
