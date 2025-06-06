import java.util.*;

public class Demo1 {
     static int Armstrong(int num){
        int n=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+(int)Math.pow(digit, 3);
            num/=10;
        }
       return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int n=Armstrong(num);
        if(n==num){
        System.out.println("Armstrong number:"+n);
        }else{
            System.out.println("Not armstrong number:");
        }
    }
}
