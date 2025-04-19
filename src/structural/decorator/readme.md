# Decorator Design Pattern

The Decorator design pattern is a structural design pattern used in OOP to add new functionality to objects dynamically without altering their structure.

## When to Use the Decorator Design Pattern
- When you want to add responsibilities to individual objects dynamically and transparently, without affecting other objects. For example, adding a toppings on pizza.
- When extending functionality through inheritance is impractical or leads to an explosion of subclasses.
- When you need to adhere to the Open/Closed Principle by allowing new functionality to be added without modifying existing code.

## Directory Structure
```
DesignPatterns/src/structural/decorator/
├── readme.md
├── Component.java
├── ConcreteComponent.java
├── Decorator.java
├── ConcreteDecoratorCheese.java
├── ConcreteDecoratorPepperoni.java
└── ConcreteDecoratorMushroom.java
```

## Components of Decorator Pattern

### 1. Component
This is the base interface or abstract class, which defines the common behavior of all the objects in composition. `Pizza` represents the component. It has two methods: `description()` and `cost()`.

### 2. Concrete Component
This class implements the `Component` interface or extends the Abstract Component class. `PlainPizza` is a concrete component. It has the basic implementation of the `Pizza` interface and provides core functionality without decorations.

### 3. Decorator
This abstract class implements the `Component` interface or extends the Abstract Component class. It references a `Component` object and defines an interface that conforms to the Component's interface. The `PizzaDecorator` abstract class serves as the Decorator. It implements the `Pizza` interface and holds a reference to a `Pizza` object. This class is designed to be extended by concrete decorators that add specific toppings to the Pizza.

### 4. Concrete Decorators
These classes extend the `Decorator` class and add specific functionalities to the `Component`. Each concrete decorator can modify the behavior of the component it decorates by implementing additional methods. `CheeseDecorator`, `PepperoniDecorator`, and `MushroomDecorator` classes are concrete decorators. Each one extends the `PizzaDecorator` class and modifies the behavior of the `Pizza` object by adding description and cost to it.

## Real-world Example
```java
import javax.swing.*;

public class TextEditor {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple Text Editor");
    JTextArea textArea = new JTextArea(30, 50);
    JScrollPane scrollPane = new JScrollPane(textArea);

    frame.getContentPane().add(scrollPane);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
```

Here, `JScrollPane` acts as a decorator for `JTextArea`.
