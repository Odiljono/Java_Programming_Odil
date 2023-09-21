package sunday_live_classes.week13.language;

public class ClassRoom {
    public static void main(String[] args) {

        //Language obj = new Language();
        // cannot instantiate an interface

        English english = new English();
        english.hello();
        english.bye();

        System.out.println();

        Spanish spanish = new Spanish();
        spanish.hello();
        spanish.bye();
        System.out.println(spanish.DEFAULT_ENCODING); // this works but
        System.out.println(Language.DEFAULT_ENCODING);// this is correct way to access
        //spanish.description(); // static methods are NOT inherited from interface

        Language.description();

        english.translate(spanish, "Hello, how are you");
    }
}