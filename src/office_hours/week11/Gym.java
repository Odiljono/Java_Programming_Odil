package office_hours.week11;

public class Gym {
    public static void main(String[] args) {

        WorkOut bench = new WorkOut("Bench Press", 60, 100);
        System.out.println(bench);

        WorkOut pushup = new WorkOut("Pushup23", -10, 2000); // all invalid data
        System.out.println(pushup);

        pushup.setName("Push Up"); // obj.name
        pushup.setMinutes(10);
        pushup.setCaloriesBurned(120);

        System.out.println("Doing " + pushup.getName() + " for " + pushup.getMinutes() + " minutes and burning " + pushup.getCaloriesBurned() + " calories");

        System.out.println(new WorkOut("", 0, 0).getName()); // to test if I give empty String

    }
}