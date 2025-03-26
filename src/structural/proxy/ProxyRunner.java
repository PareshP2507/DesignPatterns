package structural.proxy;

import java.math.BigInteger;

public class ProxyRunner {
    
    public static void main(String[] args) {
        TransactionService transactionService = new ProxyBankingService();

        Transaction savingAccountTransaction = new Transaction("Savings", "1234", "Savings", "5678", new BigInteger("100"));
        transactionService.transfer(savingAccountTransaction);

        Transaction mobileAccountTransaction = new Transaction("Mobile", "1234", "Savings", "5678", new BigInteger("100"));
        transactionService.transfer(mobileAccountTransaction);
    }
}
