import static java.lang.Math.abs;

public class AccountingFormatter implements NumberFormatter{
    public AccountingFormatter() {
    }

    @Override
    public String format(int n) {
        return String.format("(%d)", abs(n));
    }
}
