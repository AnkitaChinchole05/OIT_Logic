import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("Welcome");
            i++;
        }
    }
}
