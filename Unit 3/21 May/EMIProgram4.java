import java.util.Scanner;

public class EMIProgram4 {
    static double EMI(double principle,double duration){
        
        double Rate_Of_amt=0.05;
        
        double interest=Rate_Of_amt*principle;
        double payable=principle+interest;
        return payable/duration;
    }
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter loan Amount:");
        double principle=sc.nextDouble();
        System.out.print(" Enter Duration:");
        int duration=sc.nextInt();
        double EMI=EMI(principle,duration);
        System.out.println("EMI :"+EMI);
    }
}
