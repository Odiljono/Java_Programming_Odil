package day12_customMethods;

public class DayName {

    /*
    Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex: day(5)
        output:
            Friday
     */

    public static void main(String[] args) {

        dayName(5);

    }

    public static void dayName(int dayNum) {

        String day = "";

        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid Number";

        }

        System.out.println(day);

    }

}
