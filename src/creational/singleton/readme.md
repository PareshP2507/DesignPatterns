# Singleton Design Pattern

The Singleton Design Pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to it.

## Directory Structure

```
/DesignPatterns/
└── src/
    └── creational/
        └── singleton/
            ├── Logger.java    // Singleton class
            └── readme.md
```

## Key Features of Singleton

1. **Single Instance**: Ensures that only one instance of the class exists.
2. **Global Access**: Provides a global point of access to the instance.
3. **Lazy Initialization**: The instance is created only when it is needed.

## Implementation Example

Below is a simple implementation of the Singleton pattern in Java:
```java

public class Logger {
    private static Logger instance;

    private Logger() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
```

## Advantages

- Controlled access to the single instance.
- Reduces memory usage by preventing multiple instances.

## Disadvantages

- Can introduce global state, making testing harder.
- Not suitable for multithreaded environments without additional synchronization.

## Use Cases

- Logging
- Configuration management
- Database connections