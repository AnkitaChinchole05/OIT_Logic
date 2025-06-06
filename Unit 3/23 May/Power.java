import java.util.Scanner;

public class Power {
     static int Power(int a,int b){
      int result=(int)Math.pow(a, b);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int num1=sc.nextInt();
        System.out.print("Enter b:");
        int num2=sc.nextInt();

        int add=Power(num1, num2);
        System.out.println(add);

        
    }
}
