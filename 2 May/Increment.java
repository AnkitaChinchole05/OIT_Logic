import java.util.*;
public class Increment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter start piont:");
        int i=sc.nextInt();
        System.out.print("Enter number:");
        int n=sc.nextInt();
        while(i<=n){
            System.out.println("i: "+i);
            i+=50;
        }
    }
}
