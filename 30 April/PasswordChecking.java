import java.util.Scanner;

public class PasswordChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your password: ");
        int pass=sc.nextInt();

        if(pass== 1234){
            System.out.println("Device Unlocked");
        }else{
            System.out.println("try again");
        }
    }
}
