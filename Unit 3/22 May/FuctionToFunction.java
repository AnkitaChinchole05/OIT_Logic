import java.util.*;
public class FuctionToFunction {

    static int count(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    } 

    static boolean Armstrong(int num){
        int n=num;
        int arm=0;
        int count=count(num);
        while (n>0) {
            int digit=n%10;
            arm+=Math.pow(digit, count);
            n/=10;
        }
        if(arm==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        boolean isArm=Armstrong(num);
        if(isArm){
            System.out.println("Armstrong number:"+num);
        }else{
            System.out.println("Not armstrong number:"+num);
        }
    }
}
