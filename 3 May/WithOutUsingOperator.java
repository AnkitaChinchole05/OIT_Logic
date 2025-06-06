import java.util.Scanner;

public class WithOutUsingOperator {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int a=sc.nextInt();
        int i=a;
        while(i<=a*10){
            System.out.println(i);
            i+=a;
        }
    }
}
