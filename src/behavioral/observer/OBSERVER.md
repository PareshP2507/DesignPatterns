# Observer Design Pattern
The Observer pattern is a behavioral design pattern that allows an object, known as the subject, to notify a list of dependent objects, known as observers, about changes in its state. 

This pattern promotes loose coupling by ensuring that the subject does not need to know the specific details of its observers, making it easier to manage interactions and updates within complex systems.

## Components
### 1. Observer
This component defines a common interface for all observers that need to be notified about changes from subjects. The main responsibility of the Observer is to implement this update interface, which receives notifications from the Subject. This interface is crucial for observers to stay informed and react to changes in the Subject.

In our example, The `ServerObserver` interface represents the Observer component in the story.

### 2. ConcreteObserver
This specific implementation of the Observer interface reacts to notifications from the ConcreteSubject.

The ConcreteObserver stores state that should remain consistent with the subject's state and implements the updating interface of the Observer to keep its state aligned with the subject’s.

In our example, `AdminNotifier`, `Display` and `NotFoundHandler` are the concrete handlers.

### 3. Subject
The Subject acts as the core of the pattern and is responsible for maintaining a list of its observers. It provides an interface for attaching (registering) and detaching (unregistering) Observer objects, allowing dynamic management of observers.

In our example, `Server` class acts as subject although it is not an interface but it provides implementation to store observers and notifies them whenever needed.

### 4. ConcreteSubject
As a specific subclass of Subject, the ConcreteSubject contains actual state and business logic relevant to the application.

In our example, `Server` class acts as subject and concrete subject. It provides implementation to store observers and notifies them whenever needed.