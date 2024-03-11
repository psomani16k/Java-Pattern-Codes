package AdapterPattern;

public class TurkeyInHindi implements Turkey {
    public void bali() {
        System.out.println("TurkeyInHindi bali");
    }

    public void gobble() {
        System.out.println("TurkeyInHindi quacking");
    }

    public void fly() {
        System.out.println("TurkeyInHindi flying");
    }
}