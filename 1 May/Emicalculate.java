import java.util.Scanner;

public class Emicalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your loan amount:");
        Double amt=sc.nextDouble();
        System.out.print("Enter Duration:(6 or 12 month):");
        int month=sc.nextInt();
        double Interest= 0;

        if(month==6){
            Interest=0.02;
        }else{
            Interest=0.03;
        }
        double total_interest=amt*Interest;
        double EMI=(amt+total_interest)/month;

        System.out.println("Total amount:"+total_interest+" Rs.");
        System.out.println("EMI:"+EMI+" Rs.");
    }
}
