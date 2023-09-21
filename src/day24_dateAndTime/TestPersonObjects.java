package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Alice", 'F', LocalDate.of(1980, 12, 12));
        people[2].setInfo("John", 'M', LocalDate.of(1995, 5, 7));
        people[3].setInfo("Kim", 'F', LocalDate.of(1954, 7, 29));
        people[4].setInfo("Robert", 'M', LocalDate.of(2001, 9, 17));



        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        // print name & date of birth of each person object

        for (Person each : people) {
            System.out.println(each.name + " " + each.dateOfBirth);
        }

        // remove all the person object that has the age > 55

        studentsList.removeIf(p -> p.age > 55);

        for (Person each : studentsList) {
            System.out.println(each);
        }

    }
}