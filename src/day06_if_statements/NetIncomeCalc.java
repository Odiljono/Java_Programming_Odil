package day06_if_statements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 150_000;
        int tax;
        boolean married = true;

        if (salary >= 130_000) tax = 35;
        else if (salary >= 100_000) tax = 30;
        else if (salary >= 80_000) tax = 25;
        else tax = 20;

        if (married) tax -= 5;

        int salaryAfterTax = salary - salary * tax / 100;

        System.out.println("tax = " + tax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */