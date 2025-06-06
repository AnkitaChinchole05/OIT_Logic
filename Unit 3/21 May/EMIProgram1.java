import java.util.Scanner;

public class EMIProgram1 {

    static void EMI(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter loan Amount:");
        double principle=sc.nextDouble();
        System.out.print(" Enter Duration:");
        int duration=sc.nextInt();
        double Rate_Of_amt=0.05;

        double interest=Rate_Of_amt*principle;
        double payable=principle+interest;
        double EMI=payable/duration;
        System.out.println("EMI :"+EMI);
    }
    public static void main (String [] args){
        EMI();
    }
}
