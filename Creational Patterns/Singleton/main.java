package SingletonPattern;

public class main {
    public static void main(String[] args) {
        Settings obj1 = Settings.getInstance("dark", 0);
        Settings obj2 = Settings.getInstance("light", 1);

    }

}
