package sunday_live_classes.week14.bank;

public class CannotBeNegativeException extends Exception{

    public CannotBeNegativeException() {
        super("The input cannot be negative");
    }
}