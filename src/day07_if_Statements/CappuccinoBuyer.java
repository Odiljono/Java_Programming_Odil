package day07_if_Statements;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "Tall";
        boolean coffeeSize = size == "Tall" || size == "Grande" || size == "Venti";
        String result = "";

        if (coffeeSize) {

            if (size == "Tall") {
                result = "price is $3.69\n90 calories";
            } else if (size == "Grande") {
                result = "price is $3.99\n120 calories";
            } else if (size == "Venti") {
                result = "price is $4.29\n150 calories";
            }

        } else {
            result = "Invalid Size";
        }

        System.out.println(result);
    }
}
/*
A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
			Note: MUST use nested if
 */