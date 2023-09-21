package day34_abstraction.deviceTask;

public class DeviceShop {

    public static void main(String[] args) {

        Desktop desktop = new Desktop("Dell", "X30", 1000, "Black", "XL", true, true);

        Google googlePhone = new Google("Google", "Pixel7", 700, "Black", "XL", true, true);

        Iphone iPhone7 = new Iphone("Apple", "iPhone7", 500, "Silver", "Max", true, true);

        Laptop Lenovo = new Laptop("Lenovo", "B10", 1500, "Green", "Mini", true, true);

        PersonalComputer notePad = new PersonalComputer("Google", "Fire5", 850, "White", "Extra", true, true);

        Samsung samsungPhone = new Samsung("Samsung", "Galaxy", 1200, "Yellow", "Midi", true, true);

        Desktop desktop1 = new Desktop( null,"X30", 1000, "Black", "XL", true, true);

        System.out.println(desktop);
        System.out.println(googlePhone);
        System.out.println(iPhone7);
        System.out.println(Lenovo);
        System.out.println(notePad);
        System.out.println(samsungPhone);

        desktop.google();
        desktop.turnOff();
        desktop.browsing();

        System.out.println("__________________________________________");

        googlePhone.downloadApp();
        googlePhone.call(1234567890);
        googlePhone.text(1234567890);




    }

}
