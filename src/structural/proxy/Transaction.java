package structural.proxy;

import java.math.BigInteger;

public record Transaction(
        String srcType,
        String srcAccount,
        String destType,
        String destAccount,
        BigInteger amount) {
}
