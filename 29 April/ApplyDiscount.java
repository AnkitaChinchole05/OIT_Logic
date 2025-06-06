import java.util.Scanner;

public class ApplyDiscount {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount:");
    Double amt=sc.nextDouble();
    double discountrate=0;
    if(amt>=5000){
        discountrate=0.20;
       
    }else if(amt>=1000){
        discountrate=0.10;
        
    }else{
        discountrate=0.05;
        
    }
    double discount=amt*discountrate;
    double discountamount=amt-discount;
    System.out.println("Original amount:"+amt);
    System.out.println("Discount:"+discount+"%");
    System.out.println("Discounted Amount:"+discountamount);
   } 
}
