public class BaseFormatter implements NumberFormatter{
    String num;
    public BaseFormatter(String num){
        this.num = num;
    }
    @Override
    public String format(int n) {
        return String.valueOf(Integer.parseInt(num,n));
    }
}
