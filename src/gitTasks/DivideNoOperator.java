package gitTasks;

import java.util.Scanner;

public class DivideNoOperator {

    public static void main(String[] args) {

        DivisionWithoutOperator(-10, 4);
        DivisionWithoutOperator(15, 5);
        DivisionWithoutOperator(100, 12);

    }

    public static void DivisionWithoutOperator(int num1, int num2) {

        int result = 0;

        if (num1 > 0 && num2 > 0) {
            while (num1 >= num2) {
                num1 -= num2;
                result++;
            }
        } else {
            System.err.println("Number is negative");
        }
        System.out.println("Result = " + result);
    }

}
