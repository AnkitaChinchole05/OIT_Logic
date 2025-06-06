import java.util.Scanner;

public class PrimeNumber1 {

    static boolean Primenum(int n,int i){
        boolean isprime=true;
     
        while(i<Math.sqrt(n)){
            if(n%i==0){
                isprime=false;
                break;
            }
            i++;
        }
        return isprime;
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
