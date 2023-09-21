package day12_customMethods;

public class Capitalization {

    /*
    Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex: capitalization("cyDeO", "sCHooL")
        output:
            full name: Cydeo School
     */

    public static void main(String[] args) {

        capitalization("cyDeO", "sCHooL");

    }

    public static void capitalization(String firstName, String lastName) {

        String capitalization = firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1) + " " + lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);
        System.out.println(capitalization);

    }

}
