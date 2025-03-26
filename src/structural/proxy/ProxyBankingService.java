package structural.proxy;

/**
 * A proxy object which adds layer of control over the access to
 * {@link BankingService}
 */
public class ProxyBankingService implements TransactionService {

    private final BankingService bankingService = new BankingService();

    @Override
    public void transfer(Transaction transaction) {
        if (transaction.srcType().equals("Mobile") || transaction.destType().equals("Mobile")) {
            System.out.println("Transaction failed: " + transaction);
            return;
        }
        bankingService.transfer(transaction);
    }
}
