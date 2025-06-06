import java.util.*;

class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
            System.out.println("Binary:"+n);

            int decimal=0;
        int power=0;

        while(n>0){
            int digit=n%10;
            decimal+=(digit*(Math.pow(2, power)));
            power++;
            n/=10;
        }
        System.out.println("Decimal: "+decimal);
    }
}