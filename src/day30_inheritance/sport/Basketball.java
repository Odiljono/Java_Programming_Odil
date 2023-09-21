package day30_inheritance.sport;

public class Basketball extends Sport{

    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferre) {
        super("Basketball", rules, numberOfPlayers, numberOfReferre);
    }

    public void ball(){
        System.out.println(getName() + " is playing a ball");
    }
}
