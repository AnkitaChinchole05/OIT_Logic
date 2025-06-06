import java.util.*;

public class BetweenBandC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        if(b<a && a<c){
            System.out.println("a is between B and C");
        }else{
            System.out.println("a is  not between B and C");
        }
    }
}
