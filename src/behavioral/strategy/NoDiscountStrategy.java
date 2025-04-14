package behavioral.strategy;

/**
 * No discount strategy implementation.
 */
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total;
    }
}
