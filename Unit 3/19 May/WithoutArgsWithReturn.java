import java.util.Scanner;

public class WithoutArgsWithReturn {
    static int addition(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        int c=a+b;
        return c;
        }
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                int ans=addition();
                System.out.println("Addition: "+ans);
            }
        }
}
