import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        System.out.print("Enter d:");
        int d=sc.nextInt();

        int result=(a>b)?((a>c)?((a>d)?a:d):((c>d)?c:d)):((b>c)?((b>d)?b:d):((c>d)?c:d));
        System.out.println("Maximum number is:"+result);
    }
}
