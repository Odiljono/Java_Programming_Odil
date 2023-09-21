package sunday_live_classes.week13.language;

public class Spanish implements Language{
    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}