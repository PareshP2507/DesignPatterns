package behavioral.strategy;

/**
 * Fixed discount strategy implementation.
 */
public class FixedDiscountStrategy implements DiscountStrategy {
    private double discountAmount;

    public FixedDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double total) {
        return Math.max(0, total - discountAmount);
    }
}
