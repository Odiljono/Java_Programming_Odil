package sunday_live_classes.week14;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) throws InterruptedException {


        try {
            String s = "hello";
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("String cannot be null");
            System.out.println("Do these steps:");
        } catch (Exception e) {

        }

        System.out.println("END");

        System.out.println("--------------------------------");


        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");

        String str = "java";
        System.out.println(str.charAt(100));


    }
}