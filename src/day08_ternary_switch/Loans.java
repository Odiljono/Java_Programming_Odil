package day08_ternary_switch;

public class Loans {

    public static void main(String[] args) {

        double salary = 70_000;
        int creditScore = 680;

        String loan = (salary > 60000 && creditScore > 650) ? "Loan Approved" : "Loan Denied";

        System.out.println(loan);

    }
}
/*
Given two variables salary and credit score, use those given info to determine if you can get a loan.
                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"
              NOTE: MUST USE TERNARY.
 */