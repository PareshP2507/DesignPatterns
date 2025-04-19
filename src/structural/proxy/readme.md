# Proxy Design Pattern

The Proxy Design Pattern is a structural design pattern that introduces a surrogate or placeholder object to control access to another object. Instead of interacting directly with the real object, the client communicates with the proxy, which manages access to the real object. The proxy can handle additional responsibilities such as caching, security, logging, or lazy initialization before delegating requests to the real object.

## Directory Structure
Below is an example directory structure for implementing the Proxy Design Pattern:

```
/DesignPatterns/src/structural/proxy/
├── ProxyBankingService.java   # Proxy implementation
├── BankingService.java        # RealSubject implementation
├── TransactionService.java    # Subject interface
└── readme.md                  # Documentation
```

## When to Use the Proxy Pattern
- **Access Control**: To restrict or manage access to sensitive or resource-intensive objects.
- **Lazy Initialization**: To delay the creation and initialization of an object until it is actually needed.
- **Logging and Monitoring**: To log requests or monitor interactions with the real object.
- **Caching**: To cache results of expensive operations and return cached data for repeated requests.
- **Remote Proxy**: To represent an object in a different address space, such as in distributed systems.

## Components
### 1. Subject
The `Subject` is an interface or abstract class that defines the common methods for both the real object and the proxy. This allows the proxy to act as a substitute for the real object.  
**Example**: `TransactionService` in the code.

### 2. RealSubject
The `RealSubject` is the actual object that contains the core business logic or resource the client wants to access.  
**Example**: `BankingService` in the code.

### 3. Proxy
The `Proxy` is a placeholder or intermediary that controls access to the `RealSubject`. It may add extra functionality such as access control, logging, or lazy initialization.  
**Example**: `ProxyBankingService` in the code.
