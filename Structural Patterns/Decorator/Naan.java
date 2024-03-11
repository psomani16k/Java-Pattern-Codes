package DecoratorPattern;

public class Naan extends Decorator {
    Meal meal;

    public Naan(Meal meal) {
        this.meal = meal;
    }

    public double CalculateCost() {
        return meal.CalculateCost() + 30;
    }

    public String getDescription() {
        return "Naan";
    }
}
