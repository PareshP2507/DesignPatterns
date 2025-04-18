# Factory Design Pattern

The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It helps promote loose coupling by delegating the instantiation logic to factory classes.

## Directory Structure

```
/DesignPatterns/src/creational/factory/
├── Enemy.java                # Product
├── Dragon.java               # Concrete Product
├── Goblin.java               # Concrete Product
├── Orc.java                  # Concrete Product
├── EnemyFactory.java         # Creator
├── DragonFactory.java        # Concrete Creator
├── GoblinFactory.java        # Concrete Creator
├── OrcFactory.java           # Concrete Creator
└── readme.md                 # Documentation
```

## Components

### Product
`Enemy` is the abstract product that defines the interface for all types of enemies.

### Concrete Products
`Dragon`, `Goblin`, and `Orc` are concrete implementations of the `Enemy` interface.

### Creator
`EnemyFactory` is the abstract creator that declares the factory method for creating enemies.

### Concrete Creators
`DragonFactory`, `GoblinFactory`, and `OrcFactory` are concrete creators that implement the factory method to create specific types of enemies.

## When to Use

- When the exact type of the object to be created is determined at runtime.
- When you want to encapsulate the creation logic and avoid exposing the instantiation details.
- When you need to adhere to the Open/Closed Principle by allowing new types to be added without modifying existing code.

## Pros

- Promotes loose coupling between client code and the classes it instantiates.
- Adheres to the Single Responsibility Principle by delegating the creation logic to factory classes.
- Makes the code more scalable and easier to maintain.

## Cons

- Can introduce complexity by requiring additional classes for each concrete product and factory.
- May lead to a proliferation of factory classes in large systems.