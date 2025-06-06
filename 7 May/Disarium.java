import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int num=n;
        int power=0;
        while(num>0){
            num/=10;
            power++;

        }
        int sum=0;
        num=n;
        while(num>0){
            int digit=num%10;
            sum=sum+(int)Math.pow(digit, power--);
            num/=10;

        }
        if(n==sum){
            System.out.println(n+ " is disarium");
        }else{
             System.out.println(n+ " is not disarium");
        }
    }
}
