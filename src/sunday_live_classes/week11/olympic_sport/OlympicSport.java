package sunday_live_classes.week11.olympic_sport;

public class OlympicSport {
    /*
    	Create a class OlympicSport
		instance variables
			- name (String)
			- participants (int)
		static variable: year of first Olympics: 1896
		constructor:
			- initialize all fields
		methods:
			- compete()
		-> override compete in sub classes
		 - override toString()
     */

    String name;
    int participants;
    static int firstOlympics = 1896;

    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public void compete(){
        System.out.println("compete in olympics");
    }

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}