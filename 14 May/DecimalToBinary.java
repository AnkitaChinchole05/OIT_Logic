import java.util.*;
class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Decimal:"+n);
        String binary=" ";
        while(n>0){
            int digit=n%2;
            binary=digit+binary;
            n/=2;
        }
        System.out.println("Binary:"+binary);
    }
}