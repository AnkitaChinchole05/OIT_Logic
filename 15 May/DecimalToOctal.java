import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal number:");
        int n=sc.nextInt();
        
             System.out.println("Decimal number: "+n);
        
        int rev=0;
        while(n>0){
            int digit=n%8;
            
                rev=(rev*10)+digit;
            
            
            n/=8;
        }
        int sum=0;
        while (rev>0) {
            int digit1=rev%10;
            sum=(sum*10)+digit1;
            rev/=10;
        }
        System.out.println("Octal number: "+sum);
        }
    }

