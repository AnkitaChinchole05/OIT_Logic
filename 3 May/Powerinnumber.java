import java.util.Scanner;

public class Powerinnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.print("Enter the power:");
        int p=sc.nextInt();
        int i=1;
       int power=1;
        while(i<=p){
           power*=n;
           
            i++;

        }
        System.out.println("Power of number:"+power);
    }
}
