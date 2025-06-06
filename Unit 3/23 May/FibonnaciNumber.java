import java.util.Scanner;

public class FibonnaciNumber {
    static int Fibonnaci(int num){
        if(num<=1){
            return num;
        }else{
            return Fibonnaci(num-1)+Fibonnaci(num-2);
        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
       
       for(int i=0;i<n;i++){
        int fib=Fibonnaci(i);
        System.out.println(fib);
       }
    }
}
