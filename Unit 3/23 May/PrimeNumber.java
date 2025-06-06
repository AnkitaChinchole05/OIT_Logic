import java.util.Scanner;

public class PrimeNumber {
    static boolean Primenum(int n,int i){
        if(n<=2){
            return (n==2);
        } if(n%i==0){
            return false;
        }if(i*i>n){
            return true;
        }
        return Primenum(n,i+1);
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int i=2;
        boolean isPrime=Primenum(num,i);
        if(isPrime){
            System.out.println("Prime number:"+num);
        }else{
            System.out.println("Not prime number:"+isPrime);
        }
        }
    }

