package sunday_live_classes.week13.exercise;

public class Gym {
    /*
        create a class Gym to test the objects and methods
     */

    public static void main(String[] args) {

        //Exercise obj = new Exercise();
        // cannot instantiate abstract classes

        Running running = new Running();
        running.perform();
        System.out.println(running.getCaloriesBurned(60));

        //Lifting obj = new Lifting();
        // cannot instantiate abstract classes

        Bench bench = new Bench();
        bench.perform();
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(15));

    }
}