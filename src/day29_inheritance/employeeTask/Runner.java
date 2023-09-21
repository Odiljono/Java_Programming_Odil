package day29_inheritance.employeeTask;

public class Runner {
    public static void main(String[] args) {

        Developer dev1 = new Developer();
        dev1.setInfo("John", 'M', 25, 12, "Developer", 100000, "Java");

        System.out.println(dev1);
    }
}
