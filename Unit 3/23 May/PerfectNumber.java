import java.util.Scanner;

public class PerfectNumber {
    static boolean Perfect(int num){
       int sum=0;
       int i=1;

       while(i<=num/2){
        if(num%i==0){
            sum+=i;
        }
        i++;
       }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        boolean Perfect=Perfect(n);
        if(Perfect){
            System.out.println("Perfect number:"+n);
        }else{
            System.out.println("Not perfect number:"+n);
        }
    }
}
