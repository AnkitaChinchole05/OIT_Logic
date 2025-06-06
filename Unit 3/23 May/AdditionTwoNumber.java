import java.util.Scanner;

public class AdditionTwoNumber {
    static int Addition(int a,int b){
        if(b==0){
            return a;
            
        }else if(b>0){
            return Addition(a+1, b-1);
        }else{
            return Addition(a-1, b+1);
        }
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
