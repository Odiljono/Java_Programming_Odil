package day40_collections;

public class Test_Revert {

    public static void main(String[] args) {

        String str = "Hello";
        String str1 = "";

        for (int i = str.length()-1; i >=0; i--) {
            str1 +="" + str.charAt(i);

        }
        System.out.println(str1);
    }
}
