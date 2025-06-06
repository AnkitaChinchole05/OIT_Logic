import java.util.Scanner;

public class EMIProgram3 {
    static void EMI(double principle,double duration){
        
        double Rate_Of_amt=0.05;
        
        double interest=Rate_Of_amt*principle;
        double payable=principle+interest;
        double EMI=payable/duration;
        System.out.println("EMI :"+EMI);
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter loan Amount:");
        double principle=sc.nextDouble();
        System.out.print(" Enter Duration:");
        int duration=sc.nextInt();
       EMI(principle,duration);
    }

}
