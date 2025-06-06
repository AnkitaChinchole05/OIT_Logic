import java.util.Scanner;

public class WithArgsWithOutReturn {
    static void addition(int a,int b){
        int c=a+b;
        System.out.println("Addition :"+c);

    }
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            Scanner sc=new Scanner(System.in);
             System.out.print("Enter a: ");
             int x=sc.nextInt();
             System.out.print("Enter b: ");
             int y=sc.nextInt();
             addition(x, y);
        }
    }
}
