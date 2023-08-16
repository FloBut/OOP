package EX_OOP.ex_Principii_OOP.interfete;

public class Main {
    public static void main(String[] args) {
        Developer[] developers = new Developer[3];
        developers[0] = new Employee("Andrei", 9500);
        developers[1] = new Freelencer("Radu", 300);
        developers[2] = new Employee("Andra", 130000);

        DevDepartment devDepartment = new DevDepartment(developers);
        devDepartment.solveProductionBugs();
    }
}
