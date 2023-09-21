package sunday_live_classes.week13.building;

public class OfficeBuilding extends Building implements HasElevator {

    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying the lease");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Going to floor " + floor);
    }

    @Override
    public String toString(){
        return super.toString() + ", number of floors: " + numberOfFloors;
    }
}
/*
Create an class OfficeBuilding
		child class of Building
		implements HasElevator
		create instance variable
			int number of floors
		create a constructor to assign the location, price, and number of floors
		implement all abstract methods (give some print statements)
		override the toString to print the location, price, and number of floors
*/