package sunday_live_classes.week11.olympic_sport;

public class Track extends OlympicSport{
    public Track(int participants) {
        super("Track", participants);
    }

    @Override
    public void compete() {
        System.out.println("Track for running, jumping, throwing");
    }
}