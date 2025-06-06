
import java.util.*;

class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int cnt = 0;
        
        System.out.println("Prime Numbers in digit: ");
        while (n > 0) {
            int digit = n % 10;
            boolean isPrime = true;
            int i = 2;
            while(i <= Math.sqrt(digit)){
                if (digit % i == 0){
                    isPrime = false;
                    break;
                }
               i++;
                
            }
            
            if (isPrime){
                cnt++;
                System.out.println(digit + " ");
            }
            n /= 10;
        }

        System.out.println("Count of Primes: " + cnt);
    }
}