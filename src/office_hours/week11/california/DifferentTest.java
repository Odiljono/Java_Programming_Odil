package office_hours.week11.california;

import office_hours.week11.virginia.House;

// different package, different class
public class DifferentTest {
    public static void main(String[] args) {
        House obj = new House();
        obj.address = "1000 N lane";
//        obj.price = 100_000;
//        obj.neighborhoodName = "Berry Hills";
//        obj.ownerName = "James Bond";
        // only public is accessible in a different package
    }
}