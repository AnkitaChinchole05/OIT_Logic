import java.util.Scanner;

public class MultiOfTwoNumber {
    static int Multiplication(int a,int b){
        if(a==0||b==0){
            return 0;
        }else if(b>0){

            return a+Multiplication(a,b-1);
        }else{
            return -Multiplication(a, -b);
        }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        
       int mult= Multiplication(a,b);
        System.out.println(mult);
     }
}
