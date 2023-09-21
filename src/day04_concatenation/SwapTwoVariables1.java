package dab04_concatenation;

public class SwapTwoVariables1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
/*
Declare the following variables:
            a
            b
            c

    8.1 Write a program that swap variables a & b’ values bb using a temporarb variable c
        Ea:
              a = 10
              b = 15

        output:
                  a = 15
                  b = 10
 */