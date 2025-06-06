import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int a=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+"*"+i+"="+(i*a));
            i++;
        }
    }
}
