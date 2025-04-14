package behavioral.strategy;

/**
 * Percentage discount strategy implementation.
 */
public class PercentageDiscountStrategy implements DiscountStrategy {
    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double total) {
        return total - (total * discountPercentage / 100);
    }
}
