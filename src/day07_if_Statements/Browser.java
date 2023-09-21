package day07_if_Statements;

public class Browser {

    public static void main(String[] args) {

        String browser = "Edge";
        boolean browserName = browser == "Chrome" || browser == "Firefox" || browser == "Opera" || browser == "Safari" || browser == "Edge";
        String result = "";

        if (browserName) {
            if (browser == "Chrome") {
                result = browser + " Browser is selected";
            } else if (browser == "Firefox") {
                result = browser + " Browser is selected";
            } else if (browser == "Opera") {
                result = browser + " Browser is selected";
            } else if (browser == "Safari") {
                result = browser + " Browser is selected";
            } else {
                result = browser + " Browser is selected";
            }


        } else {
            result = "Invalid Browser Name";
        }

        System.out.println(result);

    }
}
/*
Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */