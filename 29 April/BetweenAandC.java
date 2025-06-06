import java.util.Scanner;

public class BetweenAandC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        if(a<b && b<c){
            System.out.println("B is between A and C");
        }else{
            System.out.println("B is  not between A and C");
        }
    }
}
