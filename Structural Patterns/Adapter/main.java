package AdapterPattern;

public class main {
    public static void main(String[] args) {
        Duck duck = new Battak();
        duck.bali();
        duck.fly();
        duck.quack();
        System.out.println("_________________");
        duck = new TurkeyAdapter(new TurkeyInHindi());
        duck.bali();
        duck.fly();
        duck.quack();

    }

}
