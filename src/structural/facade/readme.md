# Facade Design Pattern

The facade pattern is a structural design pattern that provides a simplified interface to a complex system of classes, libraries, or frameworks.

---

## File Structure

```
/DesignPatterns/
└── src/
    └── structural/
        └── facade/
            ├── HotelService.java
            ├── AirlineService.java
            ├── VacationAgencyService.java
            └── readme.md
```

---

## Components

### 1. Subsystem Classes
- **HotelService**: Handles hotel booking logic through methods like `bookHotel`.
- **AirlineService**: Manages flight reservations using methods like `reserve`.

### 2. Facade
- **VacationAgencyService**: Acts as the facade class, encapsulating the complexity of `HotelService` and `AirlineService`. It simplifies the process by taking parameters from the client and managing bookings.

---

## When to Use

- **Simplifying Complex Systems**: Use when you need to provide an easy-to-use interface that hides complex functionality.
- **Supporting Legacy Systems**: Ideal for integrating new components with legacy systems, acting as an intermediary for communication.
- **Integrating Third-Party Systems**: Simplifies interactions with third-party systems that require multiple steps for a single operation.
- **Reducing Coupling**: Helps in reducing direct dependencies between subsystems and clients.

---

## When Not to Use

- **Becoming a God Object**: Avoid using a facade if it becomes tightly coupled to almost all classes in the application, as it can increase complexity instead of reducing it.

