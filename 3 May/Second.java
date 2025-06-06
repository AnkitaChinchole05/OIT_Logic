import java.util.Scanner;

public class Second {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int a=sc.nextInt();
        int i=1;
        int j=a;
        while(i<=10){
            System.out.println(j);
            j+=a;
            i++;
        }
    }
}
