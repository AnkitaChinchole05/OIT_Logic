import java.util.*;

public class MinOfTwoNumber {
    static void Maximun(int a,int b){
        if(b>a){
           System.out.println("Min of :"+a);
        }else {

            System.out.println("min of :"+b);
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
       Maximun(a,b);
       
     }
}
