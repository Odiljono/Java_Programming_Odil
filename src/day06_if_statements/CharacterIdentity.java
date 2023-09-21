package day06_if_statements;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '@';
        String result = "";

        if (ch >= '0' && ch <= '9') result = "digit";
        else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) result = "Alphabetic Character";
        else result = "Special Character";

        System.out.println(result);
    }
}
