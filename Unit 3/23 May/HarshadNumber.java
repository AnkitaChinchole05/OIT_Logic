import java.util.*;
public class HarshadNumber {

    static boolean isHarshadNumber(int num){
        int n=num;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        if(num%sum==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        boolean isResult=isHarshadNumber(num);
        if(isResult){
            System.out.println(num+" is harshad number");
        }else{
            System.out.println(num+" is not harshad number");
        }
    }
}
