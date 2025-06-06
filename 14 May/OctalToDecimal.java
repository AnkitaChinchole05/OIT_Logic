import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Octal number: "+n);
        int Octal=0;
        int power=0;
        while(n>0){
            int digit=n%10;
            Octal+=(digit*(Math.pow(8, power)));
            power++;
            n/=10;
        }
        System.out.println("Decimal number: "+Octal);
    }
}
