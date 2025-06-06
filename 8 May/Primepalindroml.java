import java.util.*;
class Primepalindroml{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        boolean isPrime=true;
        
        int n=num;
        int pal=0;
        
        while(n>0){
            int digit=n%10;
            int i=2;
            while(i<=Math.sqrt(digit)){
                if(digit%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
            //System.out.println(digit);
            pal=(pal*10)+digit;
            //System.out.println(pal);
            n/=10;   
            
        }
        if(isPrime==true){
            if(pal==num){
                System.out.println("Prime palindrome number:"+pal);
            }else{
                System.out.println(pal+" is prime number but not palindrome number");
            }
            
        }else{
            System.out.println("not prime palindrome number");
        }
        
    }
}