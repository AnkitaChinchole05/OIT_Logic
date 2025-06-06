
import java.util.Scanner;
public class PowerOfTwoNumber {
     static int Power(int a,int b){
        if(b==0){
            return 1;
        }else {

            return a*Power(a,b-1);
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
       int mult= Power(a,b);
        System.out.println(mult);
     }
}
