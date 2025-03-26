package structural.proxy;

/** A Real object which is doing actual/real operation */
public class BankingService implements TransactionService {

    @Override
    public void transfer(Transaction transaction) {
        System.out.println("Transaction completed: " + transaction);
    }
}
