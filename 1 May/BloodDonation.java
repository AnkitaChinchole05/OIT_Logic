
import java.util.*;
public class BloodDonation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        System.out.print("Enter your weight:");
        int wt=sc.nextInt();
        System.out.print("Enter your Haemoglobin level:");
        Double hl=sc.nextDouble();

        if(age>18 && age<60){
            if(wt>45){
                if(hl>12.5){
                    System.out.println("Your are eligible for blood donation");
                }else{
                    System.out.println("your haemoglobin level is low");
                }
            }else{
                System.out.println("your weight is not applicable");
            }
        }else{
            System.out.println("you are not eligible for weight");
        }
    }
}
