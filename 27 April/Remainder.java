import java.util.*;
 class Remainder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr Dividend:");
        int Dividend=sc.nextInt();
        
        System.out.print("Enetr Divisor:");
        int Divisor=sc.nextInt();
        int Remainder=0;
        int Quotient=(Dividend-Remainder)/Divisor;
         Remainder=Dividend-(Divisor*Quotient);
        System.out.println("Quotient is: "+Quotient);
        System.out.print("Remainder is: "+Remainder);
    }
 }