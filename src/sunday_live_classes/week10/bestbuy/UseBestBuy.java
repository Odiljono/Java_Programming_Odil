package sunday_live_classes.week10.bestbuy;

import sunday_live_classes.week10.bestbuy.BestBuy;

public class UseBestBuy {
    public static void main(String[] args) {

        System.out.println("MAIN METHOD RUNNING");
        //System.out.println(BestBuy.ceo);
        System.out.println(new BestBuy("132213 Cook Drive", 213, 40));
        BestBuy store1 = new BestBuy("132213 Cook Drive", 213, 40);
        store1.reportProfits();
        System.out.println(BestBuy.revenue);
        // System.out.println(store1.revenue);

    }
}