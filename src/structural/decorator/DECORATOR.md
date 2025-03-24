# Decorator Design Pattern
The Decorator design pattern is a structural design pattern used in OOP to add new functionality to objects dynamically without altering their structure.

## Components of Decorator pattern
### 1. Component
This is the base interface or abstract class, which defines common behavior of all the objects in composition. `Pizza` represents component. It has two methods: `description()` and `cost()`.
### 2. Concrete component
This class implements the `Component` interface or extends the Abstract Component class. `PlainPizza` is a concrete component. It has the basic implementation of the `Pizza` interface and provides core functionality without decorations.
### 3. Decorator
This abstract class implements the the `Component` interface or extends `Abstract Component` class. It references a `Component` objects and defines an interface that conforms to the Component's interface. `PizzaDecorator` abstract class serves as Decorator. It implements the `Pizza` interface and holds a reference to `Pizza` object. This class is designed to be extended by concrete decorators that adds specific toppings to the Pizza.
### 4. Concrete decorators
These classes extend the `Decorator` class and add specific functionalities to the the `Component`. Each concrete decorator can modify the behavior of the component it decorated by implementing additional methods. `CheeseDecorator`, `PepperoniDecorator` and `MushroomDecorator` classes are concrete decorators. Each one extends the `PizzaDecorator` class and modifies the behavior of the `Pizza` object by adding description and cost to it.

## Real-world example
```
import javax.swing.*

public class TextEditor {
  public static void main(String[] args) {
    JFrame jFrame = bew JFrame("Simple Text Editor");
    JTextArea textArea = new JTextArea(30, 50);
    JScrollPane scrollPane = new JScrollPane(textArea);

    frame.getContentPage.add(scrollPane);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
```
Here, `JScrollPane` acts as a decorator for `JTextArea`.
