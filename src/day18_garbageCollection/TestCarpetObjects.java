package day18_garbageCollection;

public class TestCarpetObjects {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();

        carpet1.setInfo(1.5, 10, 100, false);
        carpet2.setInfo(1.5, 10, 100, true);

        System.out.println(carpet1);
        System.out.println(carpet2);

        System.out.println(carpet1.calcCost());
        System.out.println(carpet2.calcCost());

    }
}
