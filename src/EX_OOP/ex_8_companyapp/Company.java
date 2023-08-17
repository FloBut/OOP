package EX_OOP.ex_8_companyapp;

import java.time.LocalDate;

public class Company {

    private String name;

    private int yearFounded;

    private Department[] departments;

    private int numberOfDepartmentsAdded;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartmentsAdded) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }

    public void printAllEmployeesStreetsByDepartment (String departmentName){
        //cautam departamentul in lista de departamente a companiei pe care se apeleaza metoda
        //pe departamentul gasit, apelez metoda de printAllEmployeesAddressStreets
    }

    public String getStreetByEmployee (String employeeName){
        //caut prin fiecare lista de angajati a fiecarui departament angajatul cu numele employeeName
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            //departments[i]
            //caut angajatul cu numele employeeName in deparatamentul de la pozitia i
            Employee employee = departments[i].getEmployeeByName(employeeName);
            if (employee != null){
                return employee.getAdreesStreet();
            }
//            for (int j = 0; j < currentDepartment.getNumberOfEmployeesAdded(); j++) {
//                Employee currentEmployee = currentDepartment.getEmployees()[j];
//                if (employeeName.equals(currentEmployee.getName())){
//                    return currentEmployee.getAdreesStreet();
//                }
//            }
        }
        return "";
    }
}
