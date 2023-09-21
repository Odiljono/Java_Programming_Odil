package day08_ternary_switch;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Chrome";

        switch (browserName) {

            case "Chrome": System.out.println(browserName); break;

            case ("Firefox"):
                System.out.println(browserName);
                break;

            case ("Opera"):
                System.out.println(browserName);
                break;

            case ("Safari"):
                System.out.println(browserName);
                break;

            case ("Edge"):
                System.out.println(browserName);
                break;

            default:
                System.out.println("Invalid Browser");
                break;
                }

    }
}
/*
write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */