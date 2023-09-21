package day19_array;

public class Shopping {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        System.out.println("The first index number of \"Gloves\" is " + items[2].indexOf("G"));

        System.out.println();


        for (int i = 0; i < 6; i++) {
            if (items[i].contains("iPad")){
            System.out.println("iPad is contained in the item list");
            }
        }
        System.out.println();

        System.out.println("Report of each shopping item:");
        for (int i = 0; i < 6; i++) {

            System.out.println(items[i] + " - $" + prices[i] + " - " + itemIDs[i]);

        }


    }
}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */