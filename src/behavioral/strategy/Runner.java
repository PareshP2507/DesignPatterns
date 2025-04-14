package behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
        // Set a discount strategy (e.g., percentage discount)
        DiscountStrategy discountStrategy = new PercentageDiscountStrategy(10); // 10% discount

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart(discountStrategy);

        // Add items to the cart
        cart.addItem(new CartItem(100, 2)); // 2 items at $100 each
        cart.addItem(new CartItem(50, 1));  // 1 item at $50

        // Calculate total with discount
        double totalWithDiscount = cart.calculateTotal();
        System.out.println("Total with discount: $" + totalWithDiscount);
    }
}
