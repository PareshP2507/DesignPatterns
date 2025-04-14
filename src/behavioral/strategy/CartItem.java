package behavioral.strategy;

public class CartItem {
    private double price;
    private int qty;

    public CartItem(double price, int qty) {
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
