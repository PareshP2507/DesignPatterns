# Adapter Pattern

The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of one class into another that a client expects.

---

## Directory Structure

```
/DesignPatterns/src/structural/adapter/
│
├── ADAPTER.md                # Documentation for the Adapter Pattern
├── Runner.java               # The client that uses the Target interface
├── Player.java               # The interface expected by the client
├── AudioPlayer.java          # The existing class with an incompatible interface
└── VideoPlayer.java          # The adapter class that bridges the Target and Adaptee
```

---

## Components with example

1. **Target [Player.java](./Player.java)**   
    Defines the domain-specific interface used by the client.

2. **Adaptee [AudioPlayer.java](./AudioPlayer.java)**  
    Contains the existing functionality that needs to be adapted to the Target interface.

3. **Adapter [VideoPlayer.java](./VideoPlayer.java)**  
    Implements the Target interface and translates requests from the client to the Adaptee.

4. **Client [Runner.java](./Runner.java)**  
    Uses the Target interface to interact with the system.

---

## Example Code

### Target.java
```java
public interface Target {
     void request();
}
```

### Adaptee.java
```java
public class Adaptee {
     public void specificRequest() {
          System.out.println("Specific request from Adaptee.");
     }
}
```

### Adapter.java
```java
public class Adapter implements Target {
     private Adaptee adaptee;

     public Adapter(Adaptee adaptee) {
          this.adaptee = adaptee;
     }

     @Override
     public void request() {
          adaptee.specificRequest();
     }
}
```

### Client.java
```java
public class Client {
     public static void main(String[] args) {
          Adaptee adaptee = new Adaptee();
          Target adapter = new Adapter(adaptee);
          adapter.request();
     }
}
```

---

## How It Works

1. The **Client** interacts with the **Target** interface.
2. The **Adapter** implements the **Target** interface and translates the client's requests into calls to the **Adaptee**.
3. The **Adaptee** performs its specific functionality, which is now accessible to the client through the adapter.

This pattern is useful when integrating legacy code or third-party libraries with a new system.
