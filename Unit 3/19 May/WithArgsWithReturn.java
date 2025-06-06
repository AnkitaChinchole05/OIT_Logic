import java.util.Scanner;

public class WithArgsWithReturn {
     static int addition(int a,int b){
        
        int c=a+b;
        return c;
        }
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter a: ");
                int a=sc.nextInt();
                System.out.print("Enter b: ");
                int b=sc.nextInt();
                int ans=addition(a,b);
                System.out.println("Addition: "+ans);
            }
        }
}
