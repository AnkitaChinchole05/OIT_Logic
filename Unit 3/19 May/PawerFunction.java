import java.util.Scanner;

public class PawerFunction {
    static int power(int a,int b){
        int i=1;int result=1;
        while(i<=b){
            result*=a;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        int Addition=power(a, b);
        System.out.println(a+"^"+b+":"+Addition);
    }
}
