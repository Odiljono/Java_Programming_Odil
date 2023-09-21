package day06_if_statements;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygen = 91;
        String tankLevel = "";

        if (oxygen > 90) {
            tankLevel = "Your tank is full";
        }
        if (oxygen > 80 && oxygen <= 90) {
            tankLevel = "Still okay";
        }
        if (oxygen > 70 && oxygen <= 80) {
            tankLevel = "Don't go too far";
        }
        if (oxygen > 60 && oxygen <= 70) {
            tankLevel = "Start to head back";
        }
        if (oxygen > 50 && oxygen <= 60) {
            tankLevel = "Be careful now you at at 50%";
        }
        System.out.println(tankLevel);

    }
}
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */