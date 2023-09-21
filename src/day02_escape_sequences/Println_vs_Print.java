package day02_escape_sequences;

public class Println_vs_Print {

    public static void main(String[] args) {

        System.out.println("Hello everyone!");
        System.out.println("How are you today?");

        System.out.println("-----------------------------");

        System.out.print("Hello everyone!"); //does not append a line after text
        System.out.print("How are you today?");

    }
}
