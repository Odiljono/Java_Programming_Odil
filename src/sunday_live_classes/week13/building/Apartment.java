package sunday_live_classes.week13.building;

public class Apartment extends Building implements HasBalcony{

    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying apartment monthly lease");
    }

    @Override
    public void openBalcony() {
        System.out.println("Apartment has an open balcony");
    }

    @Override
    public String toString() {
        return super.toString() + " , monthsOfLease=" + monthsOfLease;
    }
}
/*
	- Create a class Apartment
		child class of Building
		implements HasBalcony

		create instance variable
			int months of lease

		create a constructor to assign the location, price, and months of lease

		implement all abstract methods (give some print statements)

		override the toString to print the location, price, and months of lease

 */