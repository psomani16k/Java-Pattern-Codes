package DecoratorPattern;

public class MatarPaneer extends Meal {
    public String getDescription() {
        return "Mp";
    }

    public MatarPaneer() {
        this.cost = 150.0;
    }

    public double CalculateCost() {
        return this.cost;
    }
}
