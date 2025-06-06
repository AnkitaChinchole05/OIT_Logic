import java.util.Scanner;

public class DecimalToBinary1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Binary number:");
        int n=sc.nextInt();

        int decimal=0;
        int count=0;
        while(n>0){
            int digit=n%10;
            decimal+=digit*(Math.pow(2, count));
            count++;
            n/=10;
        }
        System.out.println("Decimal: "+decimal);
    }
}
