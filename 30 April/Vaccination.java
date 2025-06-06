import java.util.Scanner;

public class Vaccination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your vaccines: ");
        int v=sc.nextInt();

        if(v==2){
            System.out.println("You are Eligible for the interview");
        }else{
            System.out.println("You are not Eligible for the interview");
        }
    }
}
