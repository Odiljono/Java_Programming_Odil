package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {
// DataType variableName = Data

        char a = '@';
        char b = '!';

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------------");

        char ch1 = 'A';
        char ch2 = 65; //get from ASCII Table

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("------------------------------------");

        char ch3 = 9000;

        System.out.println(ch3);

        System.out.println("-------------------------------------------");

        int sum = 'A' + 'B';
        //         65 + 66

        System.out.println(sum);

        System.out.println("--------------------------------------------");

        boolean r4 = true;
        boolean r5 = false;
        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);


    }
}
