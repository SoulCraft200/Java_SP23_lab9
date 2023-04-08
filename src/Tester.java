import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correct = false;
        String num = null;
        do{
            System.out.println("Enter an Integer: ");
            if(input.hasNextInt()){
                num = input.next();
                correct = true;
            }else{
                System.out.println("Please input an Integer: ");
            }
        }while(!correct);
        boolean correct2 = false;
        int n = 0;
        do{
            System.out.println("Enter an Integer: ");
            if(input.hasNextInt()){
                num = input.next();
                correct2 = true;
            }else{
                System.out.println("Please input an Integer: ");
            }
        }while(!correct2);
        BaseFormatter format1 = new BaseFormatter(num);
        AccountingFormatter format2 = new AccountingFormatter();
        System.out.println("Accounting Format:");
        format2.format(Integer.parseInt(num));
        System.out.println("Base Format:");
        format1.format(n);
    }
}
