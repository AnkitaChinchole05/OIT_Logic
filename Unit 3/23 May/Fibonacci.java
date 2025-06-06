import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        if(n<=1){
            return n;
        }else{

            return fibo(n-2)+fibo(n-1);
        }
    }
    public static void main(String[] args) {
       
        for(int i=0;i<10;i++){

            int fibo=fibo(i);
            System.out.println(fibo+" ");
        }
    }
}
