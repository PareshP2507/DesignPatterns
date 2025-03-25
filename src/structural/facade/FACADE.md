# Facade Design Pattern
The facade pattern is a structural design pattern that provides a simplified inter interface to a complex system of classes, libraries or frameworks.

## Components
### 1. Subsystem classes
In the code, `HotelService` and `AirlineService` are the subsystem classes. Each of these classes has methods like `bookHotel` and `reserve` respectively, which handles the logic of booking hotels and reserving flights.
### 2. Facade
In the code, `VacationAgencyService` is the facade class which encapsulates the complexity of dealing with `HotelService` and `AirlineService`. It takes necessary parameters from the client and takes care of bookings.

## When to use
- **Simplifying the complex systems**: Provide easy-to-use interface hiding the complex functionality.
- **Supporting legacy systems**: When integrating the new components with legacy components. Here facade can serve as an intermediator that communicates with legacy systems.
- **Integrating third-party systems**: If a third party system is complex and requires multiple steps to perfom single operation, a facade can simplify the processes.

## When not to use
- **Becoming a God object**: If the facade is coupled to almost all the classes of an app, it can make the system more complex than needed.
