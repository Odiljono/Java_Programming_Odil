package day29_inheritance.phoneTask;

public class Runner {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone();
        phone1.setInfo("XXX", "SE", "Black", "Max", 1200);
        System.out.println(phone1);

        phone1.call(2588746588L);
        phone1.text(5584225522L);
        phone1.faceTime(225456585L);
        phone1.faceTime("hik@gmail.com");

        System.out.println("________________________________");

        Nokia phone2 = new Nokia();
        phone2.setInfo("I", "Super", "Green", "Regular", 783);
        System.out.println(phone2);

        phone2.call(2588746588L);
        phone2.text(5584225522L);
        phone2.selfDefence();

        System.out.println("________________________________");

        Samsung phone3 = new Samsung();
        phone3.setInfo("XXX", "Galaxy", "Red", "Promo", 1450);
        System.out.println(phone3);

        phone3.call(2588746588L);
        phone3.text(5584225522L);
        phone3.freeze();
    }
}
