package day28_encapsulation;

import day28_encapsulation.encapsulation.Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Snickers", 15, 2.50, true);
        Candy candy2 = new Candy("Mars", 10, 2.30, false);
        Candy candy3 = new Candy("Halls", 25, 2.00, false);
        Candy candy4 = new Candy("Skittles", 8, 1.50, false);
        Candy candy5 = new Candy("Reeses", 11, 1.80, true);

        ArrayList<Candy> candies = new ArrayList<>(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy each : candies) {
            System.out.println("brand: " + each.getBrand() + ", " + "price: " + each.getPrice());

        }
    }
}
