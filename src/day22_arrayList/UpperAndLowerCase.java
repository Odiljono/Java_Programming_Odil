package day22_arrayList;

public class UpperAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        String isLower = "";
        String isUpper = "";

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)){
                isUpper += each;
            }
            if (Character.isLowerCase(each)){
                isLower += each;
            }
        }

        System.out.println(isUpper.length() == isLower.length());

    }
}
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */