package day30_inheritance.deviceTask;

public class Runner {

    public static void main(String[] args) {


        Phone iPhone12 = new Phone ("Apple", "12 Pro Max", "Gold", 12.9, 1200, true, true);

        iPhone12.call( 123456789L);
        iPhone12.text(123456789L);
        iPhone12.turnOn();
        iPhone12.turnOff();
        System.out.println(iPhone12);

        System.out.println("-----------------");

        Computer c1 = new Computer("Apple","macbook air","silver",13.2,1000,true,true,16,false);

        System.out.println(c1);
        c1.restart();

        System.out.println("-----------------");

        Iphone i1 = new Iphone("Apple", "12", "Black", 12, 900, true, true, true, 1 );

        i1.faceTime(123456789);

        System.out.println("-----------------");

        Samsung s1 = new Samsung("Samsung", "galaxy s1", "black", 9, 200, true, true);
        s1.freeze();

        System.out.println("-----------------");

        Laptop laptop = new Laptop("Apple", "macbook Pro", "Silver", 14, 2000, true, true, 16, true);
        laptop.throwAway();

        System.out.println("-----------------");

        Desktop desktop = new Desktop ("HP", "Compaq", "black", 10, 1000, false, true, 32, true);

        desktop.upgrade(true, true);
        desktop.upgrade(false, true);
        desktop.upgrade(true, false);
        desktop.upgrade(false, false);

        System.out.println("-----------------");

        SmartTV smartTV = new SmartTV("LG", "125", "White", 55, 300, false, true);

        smartTV.hulu();



    }
}
