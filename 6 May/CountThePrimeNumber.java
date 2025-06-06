import java.util.Scanner;

public class CountThePrimeNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=2;
       
        boolean isPrime=true;
        while(i<Math.sqrt(num)){ 
            
            
            if(num%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime==true){
            
            System.out.println(num+"prime");
        }else{
            System.out.println(num+"not prime");
        }
    }
    
}
