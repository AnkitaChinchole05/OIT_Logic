import java.util.Scanner;

public class MinOfThreeNumber {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("A is min");
            }else{
                System.out.println("C is Min");
            }
        }else if(b<c){
            System.out.println("B is min");
        }else{
            System.out.println("C is min");
        }
    }
}
