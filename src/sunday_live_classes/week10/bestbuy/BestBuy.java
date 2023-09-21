package sunday_live_classes.week10.bestbuy;

public class BestBuy {
    /*
    BestBuy [static]
	Create a class BestBuy
		define these instance variables:
			address, gross income, expenses
		define these static variables:
			ceo: Corie Barry
			hq: Richfield, Minnesota
			revenue: 51.76 billion
		create an instance method:
			reportProfits()
				use the income of the location and reduce the expenses. Add the result to the total revenue of all BestBuy stores
		create a class to run the code and create BestBuy objects
     */

    String address;
    double grossIncome;
    double expenses;

    static String ceo;
    static String hq;
    static double revenue;

    static { // the static block can do more than just assign
        System.out.println("STATIC BLOCK RUNNING");
        ceo = "Corie Barry";
        hq = "Richfield, Minnesota";
        revenue = 51.76; // we assume this is double units of billions
    }

    {
        System.out.println("INSTANCE BLOCK RUNNING");
    }

    public BestBuy(String address, double grossIncome, double expenses) {
        System.out.println("CONSTRUCTOR RUNNING");
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
    }

    void reportProfits(){
        revenue += grossIncome - expenses;
    }

    public String toString() {
        return "BestBuy{" +
                "address='" + address + '\'' +
                ", grossIncome=" + grossIncome +
                ", expenses=" + expenses +
                '}';
    }
}