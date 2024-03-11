package DecoratorPattern;

public abstract class Meal {
    public double cost;
    public Meal meal;

    public abstract String getDescription();

    public abstract double CalculateCost();

};