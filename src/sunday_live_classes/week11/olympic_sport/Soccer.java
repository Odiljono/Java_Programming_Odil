package sunday_live_classes.week11.olympic_sport;

public class Soccer extends OlympicSport{
    public Soccer(int participants) {
        super("Soccer", participants);
    }

    @Override
    public void compete() {
        System.out.println("Playing a soccer game");
    }
}