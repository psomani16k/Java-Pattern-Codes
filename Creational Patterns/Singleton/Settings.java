package SingletonPattern;

public class Settings {
    private String theme;
    private int user;

    private static Settings instance;

    private Settings(String theme, int user) {
        this.theme = theme;
        this.user = user;
    }

    public static Settings getInstance(String theme, int user) {
        if (instance == null) {
            System.out.println("New instance");
            instance = new Settings(theme, user);
        } else {
            System.out.println("Old instance");

        }
        return instance;
    }
}