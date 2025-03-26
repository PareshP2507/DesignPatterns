# Proxy Design Pattern
A Proxy is a structural design pattern that provides a surrogate or a placeholder for another object to control access to it. 
The client communicates with the proxy, which manages access to the real object, rather than the real object directly. Before
sending the request to the real object, the proxy can take care of additional tasks such as caching, security, logging etc.

## Components
### 1. Subject
This is typically an interface that both real and proxy object will implement. It defines methods that the proxy can use to mimic the
real object. In our code example, `TransactionService` is the subject.
### 2. RealSubject
The RealSubject is the actual object that the proxy represents. It contains real implementation of the business logic or the resource
that the client code wants to access. In our code example, `BankingService` is real object.
### 3. Proxy
The Proxy acts as a surrogate or the placeholder for the RealSubject. It controls access to the real object and may provide additional
functionality such as lazy loading, access control or logging. In our code example, `ProxyBankingService` is the proxy.
