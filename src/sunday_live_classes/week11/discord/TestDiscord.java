package sunday_live_classes.week11.discord;

public class TestDiscord {
    public static void main(String[] args) {

        Student obj = new Student("James", 7, 100);
        obj.sendMessage(); // from DiscordUser  - original
        obj.sendMessage("Anna"); // from Student - overloaded

        DiscordUser.launch();
        Student.launch();

    }
}