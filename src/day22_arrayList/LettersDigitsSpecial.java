package day22_arrayList;

public class LettersDigitsSpecial {

    public static void main(String[] args) {

        String str = "Wooden Spoon2!";
        String isLetter = "";
        String isDigit = "";
        String isSpecial = "";


        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                isLetter += each;
            }
            if (Character.isDigit(each)){
                isDigit += each;
            }
            if (!Character.isLetterOrDigit(each)){
                isSpecial += each;
            }
        }

        System.out.println("Letters = \"" + isLetter + "\";");
        System.out.println("Digits = \"" + isDigit + "\";");
        System.out.println("SpecialChar = \"" + isSpecial + "\";");
    }
}
/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */