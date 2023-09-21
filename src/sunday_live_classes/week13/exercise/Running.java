package sunday_live_classes.week13.exercise;

public final class Running extends Exercise {
    /*
    create a class Running
	inherit the Exercise class and implement the abstract methods
		for calories method return minutes * 15
     */

    @Override
    public void perform() {
        System.out.println("Running for fun");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 15;
    }
}