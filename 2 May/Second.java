import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter end number:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
