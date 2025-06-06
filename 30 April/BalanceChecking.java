import java.util.Scanner;

public class BalanceChecking {
    public static void main(String[] args) {
        double balance= 1000;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your withdrawal amount: ");
        Double amt=sc.nextDouble();

        if(amt<=balance){
            balance -=amt;
            System.out.println("successfully withdrawal");
            System.out.println("your banck balance:"+balance);
        }else{
            System.out.println("your banck balance is not sufficient"+balance);
        }
    }
}
