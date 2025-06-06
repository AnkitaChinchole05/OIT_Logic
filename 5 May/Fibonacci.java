import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();//5
        int i=1;//0
        int a=0;//0
        int b=1;
        while(i<=n){//0<=5
           
            System.out.println(a);
            int add=a+b;
            a=b;
            b=add;
            i++;
        }

    }
}
