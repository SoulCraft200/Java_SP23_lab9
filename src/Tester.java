import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correct = false;
        String num = null;
        do{
            System.out.print("Enter an Integer: ");
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
            System.out.print("Enter number base: ");
            if(input.hasNextInt()){
                n = input.nextInt();
                correct2 = true;
            }else{
                System.out.println("Please input an Integer: ");
            }
        }while(!correct2);
        NumberFormatter format1 = new AccountingFormatter();
        NumberFormatter format2 = new BaseFormatter(num);
        System.out.print("Accounting Format:");
        System.out.println(format1.format(Integer.parseInt(num)));
        System.out.print("Base Format:");
        System.out.println(format2.format(n));
    }
}
