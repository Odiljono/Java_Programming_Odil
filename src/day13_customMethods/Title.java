package day13_customMethods;

public class Title {

    public static void main(String[] args) {

        System.out.println(capitalization("jAvA"));

    }

    public static String capitalization (String word) {

        word = word.toUpperCase().charAt(0) + word.toLowerCase().substring(1);
        return word;
    }
}
