package structural.proxy;

/** A common interface that both the RealSubject and Proxy will implement. */
public interface TransactionService {

    void transfer(Transaction transaction);
}
