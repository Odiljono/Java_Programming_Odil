package sunday_live_classes.week10.earth;

import sunday_live_classes.week10.Person;

import java.util.Arrays;

public class UseEarth {
    public static void main(String[] args) {

        //Earth.northAmerica -> how to access the ArrayList
        Earth.northAmerica.add(new Person("James", 30));
        Earth.northAmerica.addAll(Arrays.asList(
                new Person("Anna", 20),
                new Person("Jane", 24)
        ));
    }
}