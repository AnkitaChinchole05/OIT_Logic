import java.util.Scanner;

public class MiddleNumberChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int a=num%10;
        num/=10;
        int b=num%10;
        num/=10;
        int c=num%10;
        num/=10;

        if(b==(a+c)){
            System.out.println(b+" is equal to "+a+"+"+c);
        }else{
            System.out.println(b+" is not equal to "+a+"+"+c);
        }
    }
}
