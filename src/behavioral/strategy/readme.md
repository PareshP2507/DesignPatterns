# Strategy Design Pattern

The **Strategy Design Pattern** is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable, promoting flexibility and reusability.

## Directory Structure

```
/behavioral/strategy/
├── CartItem.java
├── ShoppingCart.java
├── DiscountStrategy.java
├── FixedDiscountStrategy.java
├── NoDiscountStrategy.java
├── PercentageDiscountStrategy.java
├── STRATEGY.md
```

### Components with example of files

1. **Context `ShoppingCart.java`**  
    An object that relies on a strategy to execute a specific behavior. It either holds a reference to a strategy instance or receives it as a method parameter.
    The `ShoppingCart` class maintains a reference to a `DiscountStrategy` object and allows the client to set or change the strategy dynamically. It delegates the execution of the algorithm to the current strategy.

2. **Strategy interface `DiscountStrategy.java`**  
    A common interface that defines the operations available to all concrete strategies.
    This is the interface or abstract class that defines the common behavior for all concrete strategies.

3. **Concrete strategies**
    **`FixedDiscountStrategy.java`**  
    Implements the `Strategy` interface with a specific algorithm.
    **`NoDiscountStrategy.java`**  
    Another implementation of the `Strategy` interface with a different algorithm.
    **`PercentageDiscountStrategy.java`**  
    Another implementation of the `Strategy` interface with a different algorithm.

## How It Works

1. Define a `Strategy` interface with a method that all concrete strategies will implement.
2. Create multiple `ConcreteStrategy` classes that implement the `Strategy` interface.
3. Use a `Context` class to interact with the `Strategy` interface. The `Context` class allows the client to switch strategies dynamically.

## Benefits

- Promotes the Open/Closed Principle.
- Simplifies unit testing by isolating algorithms.
- Allows dynamic switching of algorithms at runtime.

## Use Cases

- When multiple algorithms are available for a specific task.
- When you want to avoid conditional statements for algorithm selection.
- When you need to encapsulate algorithm logic independently.
