package DecoratorPattern;

public class Roti extends Decorator {
    Meal meal;

    public Roti(Meal meal) {
        this.meal = meal;
    }

    public double CalculateCost() {
        return meal.CalculateCost() + 12;
    }

    public String getDescription() {
        return "roti";
    }
}
