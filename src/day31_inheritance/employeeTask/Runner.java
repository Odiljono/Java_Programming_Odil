package day31_inheritance.employeeTask;

public class Runner {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "5B", "Worker", "Amazon", 25, 'M', 100_000);
        System.out.println(emp1);
        emp1.work();

        System.out.println("______________________________");

        Developer dev1 = new Developer("Sarah", "6C", "Developer", "Ebay", 23, 'F', 110000, "Java");
        System.out.println(dev1);
        dev1.work();

        System.out.println("______________________________");

        Driver dr1 = new Driver("Sam", "8D", "Driver", "Tracks", 35, 'M', 60000);
        System.out.println(dr1);
        dr1.work();

        System.out.println("______________________________");

        Teacher teach1 = new Teacher("Jane", "9Y", "Teacher", "School", 36, 'F', 85000);
        Tester test1 = new Tester("Tom", "10F", "Tester", "Google", 28, 'M',120000);

        System.out.println(teach1);
        teach1.work();
        System.out.println(test1);
        test1.work();

    }
}
