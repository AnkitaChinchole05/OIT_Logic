import java.util.*;
public class ChekingCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a=sc.nextInt();
        System.out.print("Enter the number b:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
