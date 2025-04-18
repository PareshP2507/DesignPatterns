package creational.factory;

/**
 * In factory pattern, this interface will act as a 'Product'. It defines common
 * operations attach() and defend() that all concrete products (like Goblin,
 * Orc) will implement.
 */
public interface Enemy {
    void attack();

    void defend();
}
