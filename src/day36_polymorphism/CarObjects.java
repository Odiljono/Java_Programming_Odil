package day36_polymorphism;

import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.ArrayList;

public class CarObjects {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };

        for ( Car eachCar : cars){
            if (eachCar instanceof Honda && (eachCar.getYear() >= 2010 && eachCar.getYear() <= 2011 )){
                System.out.println(eachCar);
            }

            if (eachCar instanceof Audi && (eachCar.getYear() >= 2015 && eachCar.getYear() <= 2019 )){
                System.out.println(eachCar);
            }

            if (eachCar instanceof Tesla && (eachCar.getYear() >= 2015 && eachCar.getYear() <= 2016 )){
                System.out.println(eachCar);
            }
        }

        System.out.println("_____________________________________________________________");

        double max = 0;

        for (Car eachCar : cars) {
            if (eachCar.getPrice() > max){
                max = eachCar.getPrice();
            }
        }
        System.out.println("The highest price is : $" + max);

        System.out.println("_____________________________________________________________");

        double min = Double.MAX_VALUE;

        for (Car eachCar : cars) {
            if (eachCar.getPrice() < min){
                min = eachCar.getPrice();
            }
        }
        System.out.println("The lowest price is : $" + min);

        System.out.println("_____________________________________________________________");

        ArrayList<Tesla> teslaCars = new ArrayList<>();


        for (Car eachCar : cars) {
            if (eachCar instanceof Tesla){
               teslaCars.add ( (Tesla) eachCar);
            }
        }
        System.out.println(teslaCars);
    }
}
/*
Given the following array that contains the car objects:
				 Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
        };

		        (import them from day34 package)


	        1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016

			1.3 Write a program that can display the car that has the highest price

			1.3 Write a program that can display the car that has the lowest price

			1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
						ArrayList<Tesla> teslaCars = new ArrayList<>()
 */
