import java.util.Scanner;

public class WithoutAgrsWithoutReturn {
    static void addition(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("sum:"+c);
    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            addition();
        }
    }
}
