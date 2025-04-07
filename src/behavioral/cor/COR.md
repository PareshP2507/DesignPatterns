# Chain Of Responsibility Design Pattern
The Chain of responsibility (CoR) pattern is a behavioral design pattern that allows you to pass a request chain 
of handlers. Each handler in the chain decides whether to process the request or pass it to the next handler in
the chain.

This pattern decouples the sender of the request from the receiver, making the code more flexible and maintainable.

## Components
### 1. Handler
The handler component defines an interface for handling request and can also include methods for managing the successor handlers in the chain. It establishes the contract that each concrete handlers must follow.

In our example, `UrlHandler` is the Handler component.

### 2. Concrete Handlers
Concrete handlers implements the Handler interface. Each concrete handler contains a logic to handle particular request and can either process the request or pass it along to its successor.

In our example, `UserHandler`, `ProductHandler` and `NotFoundHandler` are the concrete handlers.

### 3. Client
The component which will actually send requests to be processed. 

In our example, `Runner` is the client. It creates an instance of `UrlParserWithHandler` and passes url to process. In `UrlParserWithHandler` the chain of handlers is created and linked. This chaining ensures that each handler gets a chance to process the URL, and if it can't, it passes it to the next handler in the chain.