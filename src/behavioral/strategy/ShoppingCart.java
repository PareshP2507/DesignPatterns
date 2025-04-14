package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final DiscountStrategy discountStrategy;
    private final List<CartItem> items;

    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getPrice() * item.getQty();
        }
        return discountStrategy.applyDiscount(total);
    }
}
