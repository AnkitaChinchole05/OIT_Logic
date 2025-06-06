import java.util.Scanner;

public class Addition {
    static int Addition(int a,int b){
       return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int num1=sc.nextInt();
        System.out.print("Enter b:");
        int num2=sc.nextInt();

        int add=Addition(num1, num2);
        System.out.println(add);

        
    }
}
