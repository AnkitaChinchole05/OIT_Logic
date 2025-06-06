import java.util.Scanner;

public class EligibilityChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 10th marks:");
        Double a=sc.nextDouble();
        System.out.print("Enter 12th marks:");
        Double b=sc.nextDouble();
        System.out.print("Enter graduation marks:");
        Double c=sc.nextDouble();

        if(a>50 && b>50 && c>50){
            System.out.println("you are eligible for interview");
        }else{
            System.out.println("you are not eligible for interview");
        }
    }
}
