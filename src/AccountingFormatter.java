import static java.lang.Math.abs;

/**
 * Converts the input to the absolute of it and wraps it in brackets.
 */
public class AccountingFormatter implements NumberFormatter{
    /**
     * Instantiates a new Accounting formatter.
     */
    public AccountingFormatter() {
    }

    @Override
    public String format(int n) {
        return String.format("(%d)", abs(n));
    }
}
