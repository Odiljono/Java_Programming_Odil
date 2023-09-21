package day14_forLoop;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";
        String letter = "";
        String digit = "";
        String special = "";

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) >96 && str.charAt(i) < 123)) {
                letter += str.charAt(i);
            } else if (str.charAt(i) >47 && str.charAt(i) < 58) {
                digit += str.charAt(i);
            } else {
                special += str.charAt(i);
            }

        }
        System.out.println("letters: " + letter);
        System.out.println("digits: " + digit);
        System.out.println("special characters: " + special);
    }
}
