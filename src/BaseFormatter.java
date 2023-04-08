/**
 * Converts the number base to the users input base
 */
public class BaseFormatter implements NumberFormatter{
    String num;

    /**
     * Instantiates a new Base formatter.
     *
     * @param num the num
     */
    public BaseFormatter(String num){
        this.num = num;
    }
    @Override
    public String format(int n) {
        return Integer.toString(Integer.parseInt(num ),n);
    }
}
