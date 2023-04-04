import static java.lang.Math.abs;

public class AccountingFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        return String.format("(%d)", abs(n));
    }
}
