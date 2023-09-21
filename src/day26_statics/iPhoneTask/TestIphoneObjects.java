package day26_statics.iPhoneTask;

import day26_statics.iPhoneTask.IPhoneTask;

public class TestIphoneObjects {

    public static void main(String[] args) {

        IPhoneTask iPhone = new IPhoneTask("iPhone12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        /*
        System.out.println( iPhone.brand );
        System.out.println( iPhone.OS );
        iPhone.printOperatingSystem();
        */

        System.out.println(IPhoneTask.brand);
        System.out.println(IPhoneTask.OS);
        IPhoneTask.printOperatingSystem();

    }
}