import java.util.Scanner;

public class ArmstrongNumber {

    static int count(int num){
        int count=0;
        while (num>0) {
            num/=10;
            count++;
        }
        return count;
    }
    static boolean Armstrong(int num){
        int n=num;
        int arm=0;
        
        int count=count(num);
       while (n>0) {
        int digit=n%10;
        arm=arm*(int)Math.pow(digit, count);
        n/=10;
       }
       if(arm==n){
        return true;
         
       }else{
        return false;
       }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        boolean arm=Armstrong(num);
        if(arm){
            System.out.println("Armstrong numbers:"+num);
        }else{
            System.out.println("Not armstrong number:"+num);
        }
    }
}
