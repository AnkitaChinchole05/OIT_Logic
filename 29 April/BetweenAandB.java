import java.util.Scanner;

public class BetweenAandB {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        if(a<c && c<b){
            System.out.println("C is between A and B");
        }else{
            System.out.println("C is  not between A and B");
        }
    }
}
