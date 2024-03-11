package DecoratorPattern;

public class main {
    public static void main(String[] args) {
        Meal meal1 = new MatarPaneer();

        System.out.println(meal1.getDescription());

        meal1 = new Roti(meal1);
        meal1 = new Naan(meal1);

        System.out.println(meal1.CalculateCost());

    }
}
