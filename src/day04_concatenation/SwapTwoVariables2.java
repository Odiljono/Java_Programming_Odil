package day04_concatenation;

public class SwapTwoVariables2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
/*
declare the following variables:
            a
            b

    9.1 Write a program that swap variables a & b’ values without using anb temporarb variables
        Ea:
              a = 10
              b = 15

        output:
                  a = 15
                  b = 10
 */