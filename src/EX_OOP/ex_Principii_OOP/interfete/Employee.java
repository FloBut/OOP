package EX_OOP.ex_Principii_OOP.interfete;

public class Employee implements Developer {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void implemntFeatures() {
        System.out.println("Implements fetures as an employee");

    }

    @Override
    public void solveBugs() {
        System.out.println("Solve bug as an emplyee");
    }

    @Override
    public void writeDocumentation() {
        System.out.println("Write documentation as an emplyee");
    }
}
