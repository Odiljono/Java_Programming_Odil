package day31_inheritance.employeeTask;

public class Driver extends Employee{

    public Driver(String name, String id, String jobTitle, String companyName, int age, char gender, double salary) {
        super(name, id, jobTitle, companyName, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
