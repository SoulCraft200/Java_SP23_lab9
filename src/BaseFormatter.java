public class BaseFormatter implements NumberFormatter{
    String num;
    public BaseFormatter(String num){
        this.num = num;
    }
    @Override
    public String format(int n) {
        return Integer.toString(Integer.parseInt(num ),n);
    }
}
