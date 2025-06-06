
import java.util.*;
public class MaxOfTwoNumber {
       static int Maximun(int a,int b){
        if(b<a){
            return a;
        }else {

            return b;
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
       int max= Maximun(a,b);
        System.out.println( "maximun:"+max);
     }
}
