# Adapter Pattern

The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of one class into another that a client expects.

In this example, we have implemented a media player system where:

- `MediaPlayer` is the **Target** interface expected by the client.
- `AdvancedMediaPlayer` is the **Adaptee**, which has an incompatible interface.
- `MediaAdapter` is the **Adapter**, which bridges the gap between the `MediaPlayer` and `AdvancedMediaPlayer`.

The `MediaPlayerImpl` class uses an adapter to handle 'mp4' file types. For 'mp3' files, it processes them directly without needing the adapter. Essentially, the adapter allows `MediaPlayerImpl` to add support for playing 'mp4' files by leveraging the existing `AdvancedMediaPlayer` class (the adaptee).

---

## Directory Structure

```
/DesignPatterns/src/structural/adapter/
│
├── Runner.java               # The client that uses the Target interface
├── MediaPlayer.java          # The interface expected by the client
├── AdvancedMediaPlayer.java  # The existing class with an incompatible interface
└── MediaAdapter.java         # The adapter class that bridges the Target and Adaptee
```

---

## Implementation Details

1. **Target [MediaPlayer.java](./MediaPlayer.java)**  
     Defines the domain-specific interface used by the client.

2. **Adaptee [AdvancedMediaPlayer.java](./AdvancedMediaPlayer.java)**  
     Contains the existing functionality that needs to be adapted to the Target interface.

3. **Adapter [MediaAdapter.java](./MediaAdapter.java)**  
     Implements the Target interface and translates requests from the client to the Adaptee.

4. **Client [Runner.java](./Runner.java)**  
     Uses the Target interface to interact with the system.

---

## More simple example

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
