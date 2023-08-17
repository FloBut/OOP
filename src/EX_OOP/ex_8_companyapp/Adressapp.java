package EX_OOP.ex_8_companyapp;

public class Adressapp {
    public static void main(String[] args) {
        Address address1 = new Address("Los Angeles", "rich street", 1);
        Address address2 = new Address("Los Angeles", "rich street", 2);
        Employee employee1 = new Employee("Ïonica", "Georgel", 10000, address1);
        Employee employee2 = new Employee("Ïonica", "Marcel", 10000, address2);
        Employee[] firstDepEmpList = {employee2, employee1};
        Address address3 = new Address("Los Angeles", "rich street", 3);
        Address address4 = new Address("Los Angeles", "rich street", 4);
        Employee employee3 = new Employee("Ïonica", "Mirel", 10000, address3);
        Employee employee4 = new Employee("Ïonica", "Costel", 10000, address4);
        Employee[] secondDepEmpList = {employee3, employee4};

       // System.out.println(employee1.getName());
       // System.out.println(employee1.getAdreesStreet());

        Department department1 = new Department("dep1",firstDepEmpList,2);
        Department department2 = new Department("dep2",secondDepEmpList,2);

        Department[] departments = {department1, department2};

        Company company = new Company("tesla", 1980, departments, 2);
        company.getStreetByEmployee("Ionica Mirel");


    }
}
