package sunday_live_classes.week10.amazon;

public class UseAmazon {
    public static void main(String[] args) {

        AmazonAccount account1 = new AmazonAccount("javaiscool", "java4life@gmail.com", false);

        //account1.email  -> cannot access because it is private

        System.out.println(account1.getEmail());

        account1.setEmail("javausedtobecool@gmail.com");

    }
}